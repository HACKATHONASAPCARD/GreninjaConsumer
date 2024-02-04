package com.hackathon.asapcardConsumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConfig {

    @Bean
    Queue createTransactionQueue() {
        return new Queue("transaction.create", true);
    }

    @Bean
    Queue updateTransactionQueue() {
        return new Queue("transaction.update", true);
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("transaction.exchange");
    }

    @Bean
    Binding bindingCreate(Queue createTransactionQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(createTransactionQueue).to(directExchange).with("create");
    }

    @Bean
    Binding bindingUpdate(Queue updateTransactionQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(updateTransactionQueue).to(directExchange).with("update");
    }
}