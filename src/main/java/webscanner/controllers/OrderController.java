package webscanner.controllers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;
import webscanner.models.HtmlOrder;
import webscanner.models.ServerOrder;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

	@GetMapping("order/server")
	public List<ServerOrder> GetUserServerOrders(){
		return null;
	}

	@GetMapping("order/html")
	public List<HtmlOrder> GetUserHtmlOrders(){
		return null;
	}

	@PostMapping("order/server")
	public ServerOrder AddServerOrder(ServerOrder order){
		return null;
	}

	@PostMapping("order/html")
	public HtmlOrder AddHtmlOrder(HtmlOrder order){
		return null;
	}

	@DeleteMapping("order/server")
	public int DeleteServerOrder(int id){
		return 0;
	}

	@DeleteMapping("order/html")
	public int DeleteHtmlOrder(int id){
		return 0;
	}

	@GetMapping("order/server/order")
	public ServerOrder GetServerOrder(int id){
		return null;
	}

	@GetMapping("order/html/order")
	public HtmlOrder GetHtmlOrder(int id){
		return null;
	}
}
