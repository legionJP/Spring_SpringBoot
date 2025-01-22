package com.jspring6.SpringJWTproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtFilter jwtFilter;


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

    }

// Bean to use the auth provider DAO
        // @Autowired
        // private UserDetailsService userDetailsService;

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

        // bean to get the hold of authentication manager
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception
    {
        return config.getAuthenticationManager();
    }

}

// to change the security config have to return the object of the security filter chain 