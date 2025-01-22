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
    - [Login Controller](src/main/java/com/jspring6/SpringJWTproject/controller/UserController.java)

```java
 @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        Authentication authentication = authenticationManager
                 .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        
        if(authentication.isAuthenticated())
        {
            return "User Logged In";
        }
        else
        {
            return "Invalid Credentials";
        }
    }
```
# Generating Token using the Secret Key

#### - [Token Generation](src/main/java/com/jspring6/SpringJWTproject/service/JwtService.java)

```java
 private Key getKey()
    {   
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);  // ask for the secret key message as bytestream 
    }
```

# Creating JWT Filter 

- when request is send the spring sec verify the credential using the username passwrd authentication 

- We can use own custom method to check the credential usinng the filter 
- as tomcat is servlet container --> sevlet is responsible to accept the user http request 
- Http request and Http Response 

- We can add the filter b/w the servlet and Servlet container when using the http req or response 
- In filter we can modify the request data 
- there can be multiple filter 
- There is already inbuilt filter in spring sec. like UsernamePassword Filter 
- we can add one more filter b/w jwtFilter 
- can add filter before or filter after 

### [JwtFilter](src/main/java/com/jspring6/SpringJWTproject/config/JwtFilter.java)

### Adding the filter in Filter Chain: 
```java

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {   
       
        http.csrf(customizer -> customizer.disable())
             .authorizeHttpRequests(request -> request
                    
                    .requestMatchers("/register","/login")
                    .permitAll()
                    .anyRequest().authenticated())
             //.httpBasic(Customizer.withDefaults())
            // .httpBasic(withDefaults())
             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
             .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

            // adding the Jwt filter 
        return  http.build();
```

# Setting Auth Token in Security Context 
- #### [jwtFilter](src/main/java/com/jspring6/SpringJWTproject/config/JwtFilter.java)

- #### [Implementing OncePerRequestFilter](src/main/java/com/jspring6/SpringJWTproject/config/JwtFilter.java)


# Validating the JWT token 

- ### [JWT Fiter ](src/main/java/com/jspring6/SpringJWTproject/config/JwtFilter.java)

- ### [ JWT Service ](src/main/java/com/jspring6/SpringJWTproject/service/JwtService.java)
