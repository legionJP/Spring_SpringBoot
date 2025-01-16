package com.jspring6.springbootsecproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {   
        // Disabling the CSRF token using the lambda 

    //     http.csrf(customizer -> customizer.disable());
    //     http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
    //     // http.formLogin(Customizer.withDefaults());
    //    // http.httpBasic(Customizer.withDefaults());
    //     http.httpBasic(withDefaults());
    //     http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    //     return http.build();
// OR 
        http.csrf(customizer -> customizer.disable())
             .authorizeHttpRequests(request -> request.anyRequest().authenticated())
             //.httpBasic(Customizer.withDefaults())
             .httpBasic(withDefaults())
             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        
        return  http.build();

 // imperattive way 
        /*
		 * Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new
		 * Customizer<CsrfConfigurer<HttpSecurity>>() {
		 * 
		 * @Override public void customize(CsrfConfigurer<HttpSecurity> configurer) {
		 * 
		 * configurer.disable(); } };
		 * 
		 * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry> custHttp = new
		 * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry>() {
		 * 
		 * @Override public void customize(
		 * AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry registry) {
		 * registry.anyRequest().authenticated();
		 * 
		 * } };
		 * 
		 * http.authorizeHttpRequests(custHttp); http.csrf(custCsrf);
         * return  http.build();
		 */


    }

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

// to change the security config have to return the object of the security filter chain 