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
```
# 5.4 Same Site Strict CSRF

```markdown

```

```markdown

```