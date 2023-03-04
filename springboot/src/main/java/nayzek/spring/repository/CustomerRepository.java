package nayzek.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import nayzek.spring.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Transactional
	@Modifying
	@Query("update Customer c set c.name = ?1, c.contacts = ?2 where c.id = ?3")
	void updateCustomer(String name, int contacts, int id);

}