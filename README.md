
# DESAFIO ASAPCARD HACKTON - GRUPO GRENINJA

Este repositório documenta a solução desenvolvida durante o Hackathon da ASAPCARD, abordando desafios relacionados ao processamento de transações financeiras. A solução envolve a leitura, análise e armazenamento eficientes de dados a partir de arquivos CSV, bem como a manipulação de atualizações de dados, utilizando o servidor RabbitMQ. O projeto foi implementado em Java, utilizando a tecnologia Spring Boot.

## Tecnologias Utilizadas
-Linguagem de Programação: Java;

-Framework: Spring Boot;

-Servidor de Mensagens: RabbitMQ;

-Banco de Dados: MySQL;

## Consumo, Persistência e Update dos dados e filas

Utilizamos o servidor RabbitMQ para gerenciar filas e trocas, permitindo uma comunicação eficiente e assíncrona entre os componentes do sistema. O processamento de dados e interações é tratado de maneira eficaz, proporcionando uma arquitetura flexível.

## Modelagem dos Dados e Entidades da Classe Consumer

A Modelagem de dados foi feita a partir das entidades Person, Transaction e Installment conforme indicado no documento do Desafio


![image](https://github.com/HACKATHONASAPCARD/GreninjaConsumer/assets/86022430/219486d4-7fcf-45fe-bb14-7cdcae28a545)


## Acesso do RabbitMQ

```
http://localhost:15672/#/queues
```
Username: 
```
guest
```
Password:
```
 guest
```

Clone do repositorio, executar projeto na sua ide

```
- git clone https://github.com/HACKATHONASAPCARD/Greninja.git
- cd main
```
```

## Autores

- [Amanda Cruz](https://github.com/amandinhacruz)

- [Gabriel Luiz](https://github.com/gabrielpeloo)

- [Natália Oliveira](https://github.com/nataliabpo)

- [Tais Arantes]([https://github.com/taisarantes)



