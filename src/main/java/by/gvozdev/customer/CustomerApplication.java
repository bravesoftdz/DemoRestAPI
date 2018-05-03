package by.gvozdev.customer;

import by.gvozdev.customer.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Implementations of {@link CustomerService} interface.
 *
 * @author Alexsander Gvozdev
 * @version 1.0
 */

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);

    }
}
