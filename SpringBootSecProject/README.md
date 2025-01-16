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

````markdown

```

````markdown

```

````markdown

```