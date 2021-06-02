package gameService;

import java.time.LocalDate;

import gameService.adapters.MernisServiceAdapter;
import gameService.business.concretes.CustomerManager;
import gameService.business.concretes.SaleManager;
import gameService.entities.concretes.Campaign;
import gameService.entities.concretes.Customer;
import gameService.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Ad","Soyad",LocalDate.of(1900, 5, 12),"12345678901");
		Game game1 = new Game(1,"'Firavun II'",20);
		Campaign campaign1 = new Campaign(1,"Mayýs ayý kampanyasý",10);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter() );
		customerManager.add(customer1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer1, game1, campaign1);
	}

}
