RabbitMQ Java Publisher
Um produtor RabbitMQ robusto em Java com suporte a Docker, projetado para publicação eficiente de mensagens em diferentes padrões de mensageria.


🚀 Tecnologias
Java 17+ - Linguagem principal

RabbitMQ 3.8+ - Broker de mensagens

Docker - Containerização

Maven/Gradle - Gerenciamento de dependências

AMQP 0-9-1 - Protocolo de mensageria

SLF4J + Logback - Logging

JUnit 5 - Testes unitários

📋 Índice
Visão Geral

Funcionalidades

Quick Start

Configuração com Docker

Arquitetura

Padrões de Publicação

API do Publisher

Recursos Avançados

Monitoramento

Deploy

Integração com Subscriber

Contribuindo

Licença

🎯 Visão Geral
Este projeto implementa um produtor RabbitMQ em Java com:

Containerização completa via Docker

Suporte a todos os tipos de Exchange (Direct, Fanout, Topic, Headers)

Confirmações de publicação (Publisher Confirms)

Retry automático para falhas de publicação

Serialização flexível (JSON, XML, Protobuf)

Pronto para produção com logging e métricas

✨ Funcionalidades
✅ Core
Publicação síncrona e assíncrona de mensagens

Suporte a Publisher Confirms para garantia de entrega

Balanceamento de carga entre múltiplas conexões

Pool de conexões e canais para alta performance
