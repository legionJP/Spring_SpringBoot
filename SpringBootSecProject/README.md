#
# Spring Security Project 


```markdown

# Importance of Security 
```markdown

- security : Authentication , Authorization ,  [use OWASP]
- performance : require the speed for any type of web
- stable app
```

# OWASP Top 10

- #### Open web Application Security Project 

```markdown
- 1. Broken Access Control 
- 2. Cryptographic failure
- 3. Injections 
- [SQL injections : user 'or 1=1' : use the prepared Statement] 
- 4. Insecure Design 
- 5 . Security Misconfigurations (like using the default the configurations)
- 6. Vulnerable and Outdated Componenets
- 7. Identtificationand Authentication Failure (encrypt the passwod when storing in db)
- 8. Software and Data Integrity Failures
- 9. Security Logging nad Monitoring Failures (avoiding the log due to perfromance can lead to issue)
- 10. Server-side Request Forgery (SSRF)

```

# 1. Default Login Form 
-  ### [Spring Security dependency](pom.xml)

```markdown
# Spring Security -  
- The Spring Security add the one more layer of Spring Security with multiple filter and - then Dispatch Servlet -- then the Servlet sends the request to the particular Controller 

```

# 2. Spring Security Layers 

```markdown

- By default Filters : 

1. Filter Chain 
(Client -> Servlet Container -->Filter1-filter2 (They can call eachother for checking the logic or filtering )----> Servlet )

```

# 3. Session ID 

```java

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greeting(HttpServletRequest request) {
        return "Hello World" +request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request)
    {
        return "About Page " + request.getSession().getId();
    }
```

# 4. Getting  Custom User Name and Password
- [Hardcoding the User and Password ](src/main/resources/application.properties)
- You can Send the Auth key value in the API client as well 

# 5. CSRF : 

# 5.1 CSRF Intro 

- When the user go the malicious website the website try to store the session id of the secure website and and this is called the cross site request forgery.

 - If every request is returning the token and next time when request is send need to submit the token as well 

- By request the Spring sec will implement the CSRF for the Post Put Update and Delete


# 5.2 Error Without CSRF Token 
```markdown 
 {
    "id": 1,
    "name": "JP",
    "tech": "Rust"
  }
   401 Unauthorize
```
# 5.3 Sending the CSRF Token 

```java
// Getting the csrf-token by servlet 

   @GetMapping("csrf-token") 
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
            return (CsrfToken) request.getAttribute("_csrf");
    }
// TO send the post request add the csrf token in header with X-CSRF-TOKEN

```
# 5.4 Same Site Strict CSRF

- this will not allow the cross site access 
```markdown
# application Properties : 
server.servlet.session.cookie.same-stie=strict
```

#### Making the Web Stateless
- REST API :
-  1. Stateful(using the same session id for the one login and subsequent req) 
- 2. Stateless : in this we need to login with the user name and password  

# 5.5 Security Configuration 
- #### 1. [Specifying the Own Spring Security](src/main/java/com/jspring6/springbootsecproject/config/SecurityConfig.java)

```java
 @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {  
        return http.build();
    }

```
- #### 2.  [Disabling the CSRF Token](src/main/java/com/jspring6/springbootsecproject/config/SecurityConfig.java)


# 6. Working With the Multiple Users

- By default the spring security usages called the UserDetailsService to check for the applocation Properties for user and password 

- Defining the Own User Details Service

```java
//    UserDetailService for the MultiUsers 
        @Bean
        public UserDetailsService userDetailsService()  // Spring will lookup for the obj serDetailsService to lookup the user data
        {
        //    UserDetails user = User.builder().build();
             @SuppressWarnings("deprecation")
            UserDetails user = User
                    .withDefaultPasswordEncoder()  //defaultencoder
                    .username("user")
                    .password("super123")
                    .roles("USER")
                    .build();

            @SuppressWarnings("deprecation")
            UserDetails admin = User
                .withDefaultPasswordEncoder()  //defaultencoder
                .username("Tor")
                .password("super123")
                .roles("ADMIN")
                .build();

            return new InMemoryUserDetailsManager(user, admin);
        }


}
```

# 7 Creating the User Table and DB Properties 

```markdown

# To connect the database using the JPA , add the dependencies 
- db driver
- jpa dependencies

# auth provider layer 

- need to add the authentication provider : ---> Authentication Object 
- auth provider will be connected to the db using the DAO (Data Access Object ) layer

```

# 8. Authentication Provider 

- #### [Config Class](src/main/java/com/jspring6/springbootsecproject/config/SecurityConfig.java)

- ####  User Details Service 
```java



// Bean to 
        private UserDetailsService userDetailsService;

        @SuppressWarnings("deprecation")
        @Bean
        public AuthenticationProvider authProvider() // setuserDetailsService is dependent on the authprovider
        {
            DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
            provider.setUserDetailsService(userDetailsService);
            // specify pass encoder
            provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // to use the password encoder replace it 
            return provider;
        }

```
# 9. Creating User Repository using DAO

- #### [user repo  class](src/main/java/com/jspring6/springbootsecproject/dao/UserRepo.java)

# User Details and User Principal

- #### [User Principal](src/main/java/com/jspring6/springbootsecproject/model/UserPrincipal.java) 

- #### [My User Details ](src/main/java/com/jspring6/springbootsecproject/service/MyUserDetailsService.java)

```markdown

- Authenticating the Current user in Spring Security called the User Principal 
```
# 10 . 