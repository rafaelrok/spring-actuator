<img src="https://i.ibb.co/cFXZ1Ls/spring-send-Copia.jpg" />

# Monitorando sua aplicação Spring RESTful com Spring Boot Actuator.

Nesse projeto foi desenvolvido para monitorar sua aplicação em produção. Com uso do Spring
Boot Actuator, um subprojeto do universo Spring Framework Utilizando os endpoints "/health", "/info", "/sheduledstaks"
, "/mappings" e "/httptrace", adicionando novas métricas ao HealthCheck e informações customizadas no
endpoint "/info", crie um endpoint próprio e apliquei um filtro customizado do HttpTrace que irá listar
somente as requisições realizadas para os recursos.

## O que é?

O **Spring Boot Acutator** é um subprojeto do **Spring Framework** com o objetivo de monitorar uma aplicação, coletar
métricas, entender o tráfego HTTP ou o estado do nosso sistema.

## Endpoints do Spring Actuator utilizados em aula:

- /actuator
- /info
- /health
- /mappings
- /httptrace
- /env
- /scheduledtasks

Documentação: [Spring Boot Actuator - Endpoints](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints)

Para testar todos os recusos da aplicação bem como os endpoints do Spring Actuator, utilize a collection do Postman
abaixo.

- Postman: [Postman](https://www.getpostman.com/collections/7b7dc509c3a4b5e7f664)

## Como adicionar a dependência do Spring Actuator na sua aplicação?

- pom.xml
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
    ```

- gradle
    ```
    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-actuator'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
    }
    ```

## Requisitos

- Java 11+
- Sua IDE de preferência (No meu caso, [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/))

## Developer

| [<img src="https://avatars.githubusercontent.com/u/8467131?v=4" width="75px;"/>](https://github.com/rafaelrok) |
| :-: |
|[Rafael Vieira](https://github.com/rafaelrok)|
