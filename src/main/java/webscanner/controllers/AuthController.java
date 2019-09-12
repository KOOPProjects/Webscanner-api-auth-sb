package webscanner.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import webscanner.models.SbusersEntity;
import webscanner.repositories.UserRepository;
import webscanner.requests.LoginRequest;
import webscanner.requests.RegisterRequest;
import webscanner.responses.LoginResponse;
import webscanner.responses.RegisterResponse;
import webscanner.token.JwtTokenUtil;

@RestController
@CrossOrigin
public class AuthController {

	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "auth/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {

		try {
			authenticate(request.getUserName(), request.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SbusersEntity user = userRepository.getSbusersEntityByLogin(request.getUserName());
		final String token = jwtTokenUtil.generateToken(user);
		return ResponseEntity.ok(new LoginResponse(token));
	}

	@RequestMapping(value = "auth/register", method = RequestMethod.POST)
	public RegisterResponse register(@RequestBody RegisterRequest request){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encryptedPassword = encoder.encode(request.getPassword());


		return null;
	}


	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}
