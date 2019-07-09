package webscanner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webscanner.models.HtmlOrdersEntity;
import webscanner.repositories.HtmlOrdersEntityRepository;

import java.util.List;

@RestController
public class OrderController {

	@Autowired
	private HtmlOrdersEntityRepository htmlOrderRepository;

//	@GetMapping("order/server")
//	public List<ServerOrder> GetUserServerOrders(){
//		return null;
//	}

	@GetMapping("order/html")
	public List<HtmlOrdersEntity> GetUserHtmlOrders(){
		return htmlOrderRepository.getHtmlOrdersEntityForUser("d4c82104-34f8-4b79-ac03-1e7478716dcc");
	}

//	@PostMapping("order/server")
//	public ServerOrder AddServerOrder(ServerOrder order){
//		return null;
//	}
//
//	@PostMapping("order/html")
//	public HtmlOrder AddHtmlOrder(HtmlOrder order){
//		return null;
//	}
//
//	@DeleteMapping("order/server")
//	public int DeleteServerOrder(int id){
//		return 0;
//	}
//
//	@DeleteMapping("order/html")
//	public int DeleteHtmlOrder(int id){
//		return 0;
//	}
//
//	@GetMapping("order/server/order")
//	public ServerOrder GetServerOrder(int id){
//		return null;
//	}
//
//	@GetMapping("order/html/order")
//	public HtmlOrder GetHtmlOrder(int id){
//		return null;
//	}
}
