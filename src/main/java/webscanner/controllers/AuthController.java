package webscanner.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import webscanner.requests.LoginRequest;
import webscanner.requests.RegisterRequest;
import webscanner.responses.LoginResponse;
import webscanner.responses.RegisterResponse;

@RestController
public class AuthController {
	
	@PostMapping("auth/login")
	public LoginResponse login(@RequestBody LoginRequest request) {
		long currentTime = System.currentTimeMillis();
		String token =  Jwts.builder()
				.setSubject(request.getUserName())
				.claim("roles", "user")
				.setIssuedAt(new Date(currentTime))
				.setExpiration(new Date(currentTime + 50000))
				.signWith(SignatureAlgorithm.HS512, request.getPassword())
				.compact();
		return null;
	}

	@PostMapping("auth/register")
	public RegisterResponse register(@RequestBody RegisterRequest request){
		return null;
	}
}
