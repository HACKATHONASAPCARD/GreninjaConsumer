package com.hackathon.asapcardConsumer.mq;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hackathon.asapcardConsumer.model.Transaction;
import com.hackathon.repository.PersonRepository;
import com.hackathon.repository.TransactionRepository;

@Component
public class MqConsumer {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PersonRepository personRepository;

    @RabbitListener(queues = "transaction.create")
    public void consumeCreateTransaction(List<Transaction> transactions) {
        transactions.forEach(transaction -> {
            var person = personRepository.findById(transaction.getPerson().getId());
            if (person.isPresent()) {
                transaction.setPerson(person.get());
            } else {
                personRepository.save(transaction.getPerson());
            }
        });

        transactionRepository.saveAll(transactions);
    }

    @RabbitListener(queues = "transaction.update")
    public void consumeUpdateTransaction(List<Transaction> transactions) {
        transactions.forEach(transaction -> {
            var updateStatus = transactionRepository.findById(transaction.getId());
            updateStatus.ifPresent(existingTransaction -> {
                existingTransaction.setStatus(transaction.getStatus());
                transactionRepository.save(existingTransaction);
            });
        });
    }
}
