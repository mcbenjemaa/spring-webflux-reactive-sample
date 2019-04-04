# spring-webflux-reactive-sample
Sample Reactive REST API using spring boot and spring webflux

tutorial from https://www.baeldung.com/spring-webflux

# Dependencies
Let’s start with the spring-boot-starter-webflux dependency, which actually pulls in all other required dependencies:

spring-boot and spring-boot-starter for basic Spring Boot application setup
spring-webflux framework
reactor-core that we need for reactive streams and also reactor-netty
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
    <version>2.0.3.RELEASE</version>
</dependency>
```
