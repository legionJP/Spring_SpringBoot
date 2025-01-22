package com.jspring6.SpringJWTproject.config;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jspring6.SpringJWTproject.service.JwtService;
import com.jspring6.SpringJWTproject.service.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    JwtService jwtService;

    @Autowired
    private ApplicationContext context;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain)
            throws ServletException, IOException {

                // getting headers
                String authHeader = request.getHeader("Authorization");
                String token = null;
                String userName = null;

                if(authHeader != null && authHeader.startsWith("Bearer "))
                {
                    token = authHeader.substring(7);
                    userName = jwtService.extractUserName(token);
                }

                if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null)
                {
                    UserDetails userDetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(userName);
                    if(jwtService.validateToken(token, userDetails))
                    {
                        UsernamePasswordAuthenticationToken authToken = 
                                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                        authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(authToken);
                    }

                }
                filterChain.doFilter(request, response);

    }   // to call this filter for every request , and this is abstract class


}
