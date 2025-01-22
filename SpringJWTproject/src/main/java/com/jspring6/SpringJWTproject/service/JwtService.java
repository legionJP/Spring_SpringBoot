package com.jspring6.SpringJWTproject.service;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService { // it should have the header payload ..as token 

    // Generating the randome SECRET key 
    //1.  HARDCODE
   // private static final String SECRET = "e25e96fffa1355e5577f6e51c152b906e42a49e5327df89a8686235b201d6fad7c348c644f89e97a9f7461d369cb76e32db8ef810734dd15b6fd01f5a2c4013210dfcc48b2b51b2144128ab2e4650130e75eb285b7c4863e6e1879a912f90d1955abb149643ccfdcdb590a507284b720ed4d33d155d7588a21a3497e50b1d984b4dda732ed952ecb7ddd596ea2a6e25de0abff3830b28d78a284917c66696eddd444f908a0fee6b3447bfe222de8c2f2e2ae8ee41d760d0ebcefbc2941210cce4f286d82c4fd839ff80f5a408e32aa9db6601624ed724a81a7bfbb7ced7120a0fb6dc4088f25ea6f961b39fabe305c9d8438b6e4a467723a1310a252a45886c5";

   //2. OR

    private String secretKey;

    public JwtService()
    {
        this.secretKey= generateSecretKey();
    }

    public String generateSecretKey()
    {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            SecretKey secretKey = keyGen.generateKey();
            System.out.println("Secret Key: "+ secretKey.toString());
            return Base64.getEncoder().encodeToString(secretKey.getEncoded());

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating secret key", e);
        }
    }

    // @Override
    // public String toString() {
    //     return "JwtService []";
    // }

    public String generateToken(String username) {
       
        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000*60*3))
                .signWith(getKey(), SignatureAlgorithm.HS256).compact();
                                
                
    }
    private Key getKey()
    {   
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);  // ask for the secret key message as bytestream 
    }
                   
}
