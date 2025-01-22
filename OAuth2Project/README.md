#
# OAuth2 Project 


```markdown
- using the OAuth2 via Google O-auth2 and Github OAuth2
- third party will access info from google about users to the servers
```

# Implementing OAuth2

- ### 1. [ Google OAuth2 Configuration](src/main/resources/application.properties)

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean 
    public SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());
                 
        return http.build();
    }
}
```

- ### 2. [GitHub OAuth2 Configuration](src/main/resources/application.properties)
