package com.hackathon.asapcardConsumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.asapcardConsumer.model.Transaction;
import com.hackathon.repository.PersonRepository;
import com.hackathon.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PersonRepository personRepository;

    public void processTransactions(List<Transaction> transactions) {
        transactions.forEach(transaction -> {
        });

        transactionRepository.saveAll(transactions);
    }

}