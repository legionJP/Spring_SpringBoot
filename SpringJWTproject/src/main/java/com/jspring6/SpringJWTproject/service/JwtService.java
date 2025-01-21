package com.jspring6.SpringJWTproject.service;

import java.security.Signature;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    public String generateToken(String username) {
       
        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
                .setClaims(claims)

                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600*60*3))
                .signWith(getkey(), SignatureAlgorithm.HS256).compact();
                                
                
    }
    private Key getKey()
    {   
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
                
                 
    
}
