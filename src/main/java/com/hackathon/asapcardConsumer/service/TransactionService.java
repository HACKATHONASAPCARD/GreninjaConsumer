package com.hackathon.asapcardConsumer.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.asapcardConsumer.model.Transaction;
import com.hackathon.repository.InstallmentRepository;
import com.hackathon.repository.PersonRepository;
import com.hackathon.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private InstallmentRepository installmentRepository;

    public void processTransactions(List<Transaction> transactions) {
        transactions.forEach(transaction -> {
        });

        transactionRepository.saveAll(transactions);
    }
    
    
    public void processFile (File file) {
    	 List<Transaction> transactions = new ArrayList<>(); 
    	 
    	 try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    		 String line;
    		 while ((line = br.readLine()) != null) {
    			 Transaction transaction = new Transaction();
    			 
    			 //Lógica para processar cada linha e preencher os campos da transação 
    			 
    			 transaction.setStatus('P');
    			 transaction.add(transaction);
    		 }
    	 } catch (IOException e ) {
    	  //Trate exceções relacionadas à leitura do arquivo, se necessário 
    		 e.printStackTrace(); 
    	 }
    	 transactionRepository.saveAll(transactions);
    }

}