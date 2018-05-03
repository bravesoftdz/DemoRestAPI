package by.gvozdev.customer.service;

import by.gvozdev.customer.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @author Alexsander Gvozdev
 * @version 1.0
 */

public interface CustomerService {

    Customer getById(Long id);
    void save(Customer customer);
    void delete(Long id);
    List<Customer> getAll();

}
