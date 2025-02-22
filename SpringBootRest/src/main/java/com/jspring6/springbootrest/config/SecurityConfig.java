package com.jspring6.springbootrest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {   
        
// OR 
        http.csrf(customizer -> customizer.disable())
             .authorizeHttpRequests(request -> request.requestMatchers("/register").permitAll())
             .authorizeHttpRequests(request -> request.anyRequest().authenticated())
             //.httpBasic(Customizer.withDefaults())
             .httpBasic(withDefaults())
             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        
        return  http.build();
    }
// Bean to use the auth provider DAO
        @Autowired
        private UserDetailsService userDetailsService;

        // @SuppressWarnings("deprecation")
        @Bean
        public AuthenticationProvider authProvider() // setuserDetailsService is dependent on the authprovider
        {
            DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
            provider.setUserDetailsService(userDetailsService);
            // specify pass encoder
        //    provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // to use the password encoder replace it 
            provider.setPasswordEncoder(new BCryptPasswordEncoder(12)); // to use the password encoder replace it 

            return provider;
        }

}

// to change the security config have to return the object of the security filter chain 