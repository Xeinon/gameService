package gameService.business.abstracts;

import gameService.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
