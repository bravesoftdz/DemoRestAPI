package by.gvozdev.customer.repository;

import by.gvozdev.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * REST controller for {@link Customer} connected requests.
 *
 * @author Alexsander Gvozdev
 * @version 1.0
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
