package gameService.business.concretes;

import gameService.business.abstracts.CustomerCheckService;
import gameService.business.abstracts.CustomerService;
import gameService.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			System.out.println("M��teri ba�ar�yla eklendi" + customer.getFirstName() );
		}
		else {
			System.out.println("Kullan�c� bilgileri yanl��!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
