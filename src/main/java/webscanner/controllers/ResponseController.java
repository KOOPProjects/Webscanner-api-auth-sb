package webscanner.controllers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webscanner.models.Response;
import webscanner.repositories.ResponseRepository;

import java.util.Date;
import java.util.List;

@RestController
public class ResponseController {

    @Autowired
    private ResponseRepository responseRepository;

	@GetMapping("api/response")
	public List<Response> GetOrderResponses(int orderId, String orderType){
		return responseRepository.getResponsesByOrderIdAndType(orderId, orderType);
	}
}
