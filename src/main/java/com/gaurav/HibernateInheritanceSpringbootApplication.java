package com.gaurav;

import com.gaurav.entity.InternationalCustomer;
import com.gaurav.entity.NationalCustomer;
import com.gaurav.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceSpringbootApplication implements CommandLineRunner {

    private CustomerRepository customerRepository;

    public HibernateInheritanceSpringbootApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateInheritanceSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerRepository.save(new InternationalCustomer("Zack", "Anderson",
                "LLT2TX4YT"));
        customerRepository.save(new NationalCustomer("Sierra", "Winch",
                "53994JJ5TX"));
    }
}
