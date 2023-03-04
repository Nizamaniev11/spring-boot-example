package nayzek.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nayzek.spring.models.Customer;
import nayzek.spring.repository.CustomerRepository;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public void create(Customer object) {
		customerRepository.save(object);
	}

	public Customer getById(int id) {
		return customerRepository.getById((long) id);
	}

	public void update(String name, int contacts, int id) {
		customerRepository.updateCustomer(null, contacts, id);
	}

	public void delete(Customer customer) {
		customerRepository.delete(customer);
	}

	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

}