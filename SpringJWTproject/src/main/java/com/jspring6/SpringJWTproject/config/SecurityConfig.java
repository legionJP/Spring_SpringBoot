package com.jspring6.SpringJWTproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
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
        // @Bean
        // public UserDetailsService userDetailsService()  // Spring will lookup for the obj serDetailsService to lookup the user data
        // {
        // //    UserDetails user = User.builder().build();
        //      @SuppressWarnings("deprecation")
        //     UserDetails user = User
        //             .withDefaultPasswordEncoder()  //defaultencoder
        //             .username("user")
        //             .password("super123")
        //             .roles("USER")
        //             .build();

        //     @SuppressWarnings("deprecation")
        //     UserDetails admin = User
        //         .withDefaultPasswordEncoder()  //defaultencoder
        //         .username("Tor")
        //         .password("super123")
        //         .roles("ADMIN")
        //         .build();

        //     return new InMemoryUserDetailsManager(user, admin);
        // }

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