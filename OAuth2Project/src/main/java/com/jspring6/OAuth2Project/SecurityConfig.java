package com.jspring6.OAuth2Project;

// import java.beans.Customizer;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    // Using with the default customization
    public SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());
                               
        return http.build();
    }
      
    // Using with the customization for login page

    //     @Bean
    //     public SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception {
    //         http.authorizeHttpRequests(auth -> auth
    //                 .requestMatchers("/login", "/oauth2/**", "/css/**", "/js/**").permitAll() // Exclude certain paths from authentication
    //                 .anyRequest().authenticated())
    //             .oauth2Login(oauth2 -> oauth2.loginPage("/login").defaultSuccessUrl("/"))
    //             .formLogin(form -> form.loginPage("/login").defaultSuccessUrl("/"));
                     
    //         return http.build();
    // }

}

// package com.jspring6.OAuth2Project;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Bean 
//     public SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception {
//         http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
//             .oauth2Login(oauth2 -> oauth2.loginPage("/login").defaultSuccessUrl("/"))
//             .formLogin(form -> form.loginPage("/login"));
                 
//         return http.build();
//     }
// }

// //Client ID : 

// // Client Secret: 