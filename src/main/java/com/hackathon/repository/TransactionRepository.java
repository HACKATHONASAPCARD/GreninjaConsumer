package com.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.asapcardConsumer.model.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
