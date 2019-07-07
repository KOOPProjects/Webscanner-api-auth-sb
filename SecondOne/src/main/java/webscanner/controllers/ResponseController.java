package webscanner.controllers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webscanner.models.Response;

import java.util.Date;
import java.util.List;

@RestController
public class ResponseController {
	
	@GetMapping("response")
	public List<Response> GetOrderResponses(int id, String type){
		return null;
	}
}
