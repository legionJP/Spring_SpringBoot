# Spirng6 and SpringBoot3 Guide

## 1. Intro to Spring 6 and Spring Boot 3

###  [Spirng Boot Guide](Spring_SpringBoot/sf6sb3)

## 2. Spring Framework and Core Spring

###  [Spring Guide ](Springjp/)

## 3. Spring JDBC

###  [Spring JDBC Project](SpringJDBCjp/src/)

- [JDBC Intro](https://github.com/legionJP/Java_language/blob/master/jdbc-example/src/main/java/com/example/App.java)

- [Spring JDBC Model](SpringJDBCjp/src/main/java/com/jspring6/springjdbcjp/model/Student.java)

#
## 4. Spring Boot Web App using Servlets

- [Servlet Intro](ServletWebsite/Docks/ServletsSpringBoot.md)

- [Spring Boot Servlet App](ServletWebsite/src/main/java/com/jspring6/App.java)

#
## 5. Spring Boot Web App and MVC

- [ Spring Boot Web App using the Spring Web](SpringBootWebApp1/src/main/java/com/jspring6/springbootwebapp1/SpringBootWebApp1Application.java)

#
## 6. Spring Web  MVC (without SpringBoot)

- [Spring MVC ](SpringMVCwebApp)

#
## 7. Building the Project

- [Job Projet](SpringJobProject)

# 
## 8. REST APIs in Spring Boot
- #  [REST APIS in Spring](SpringBootRest)

 - [Intro to REST APIS ](https://github.com/legionJP/Learn_APIs)
 - [REST APIS in Spring  intro ](SpringBootRest/RESTSpringIntro.md)

# 
## 9. Spring DataJPA

- [DATA JPA](SpringDataJPAproject/)
- [JPA in Rest APP  ](SpringBootRest/)

# 
## 10. Project Using the SpringBoot MVC

- [Ecom-web-app](SpringEcomWebAPP)

#
## 11. Spring Data Rest 

- ##### [Spring Data Rest Project](SpringDataRestApp/)


#
## 12. Spring AOP 

- AOP : Aspect Oriented Programming 

- #### [Spring AOP  and Logging](SpringBootRestAOP/)


#
## 13. Spring Security 

- #### [Spring Security Project](SpringBootSecProject/)


#
## 14 . Securing Spring App

- #### [Securing Job App](SpringJobProject/)


# Dependency for the Sprig boot security 

- Changing the Configuration add the confif file 


#
## 15.  JWT and OAuth2
- ### []()

# 15.1 Encryption and Decryption
```markdown
# Encryption : when sending the data using the key and convert it into cipher 
# Decryption : 

- 1. Symmetric Key : Will have the same key to encrypt and decrypt , It is faster and large key size 
Algos : AES , DES

- 2.  Asymmetric Key: where you have the piblic and private :
when the data is encrypt using public key need the another private key to decrypt 

- so when therer is multi-user or client they encrypt the data using the public key shared b/w them 
- and decrypted by it's private key combination.

Algos : RSA, ECDSA

```

# Digital Signature :

```markdown
- To verify the right owner we use the Digital Signature ,
- We have to encrypt the msg using the own pvt key , and to decrypt we have to share the public key.

# But in this process their is no security any one can read the data using the public key sender 

# To prevent the sec issue we can use the double encryption 1st encryption using the pub key of the 
user and sencond key as digital signature 
```

# Why JWT and What is JWT : 

```markdown
# Scenario
- When we need the pass which have the digital sign of the authority 
- if the web is dynamic we nedd auth but when the server is stateless we need to use the session to verify 
- user , like using the session_ID
- if we have horizontal scalling server and it hsve the same db , or the load balancer send the particular user to destin server

- But instead of doing above thing we can give the pass to client , a signed pass 
like JSON Web Token (JWT) 
```
