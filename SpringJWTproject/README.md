# Spring JWT 

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

# But in this process there is no security any one can read the data using the public key sender 

# To prevent the sec issue we can use the double encryption 1st encryption using the pub key of the 
user and sencond key as digital signature 
```

# Why JWT and What is JWT : 

```markdown

# Scenario
- When we need the pass which have the digital sign of the authority 
- if the web is dynamic we need auth. but when the server is stateless ,
    we need to use the session to verify user , like using the session_ID
- if we have horizontal scalling server and it hsve the same db,
    or the load balancer send the particular user to destin server

- But instead of doing above thing we can give the pass to client , a signed pass 
like JSON Web Token (JWT) 

```
# JWT Project Setup and Security and DB Config 

```java
 @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {   
       
        http.csrf(customizer -> customizer.disable())
             .authorizeHttpRequests(request -> request
                    
                    .requestMatchers("/register","/hello")
                    .permitAll()
                    .anyRequest().authenticated())
             //.httpBasic(Customizer.withDefaults())
            // .httpBasic(withDefaults())
             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        
        return  http.build();

    }
```

# Custom Login 
