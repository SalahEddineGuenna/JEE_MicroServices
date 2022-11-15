package org.sid.billingservice;

import org.sid.billingservice.feign.CustomerRestclient;
import org.sid.billingservice.feign.ProductitemRestClient;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.repository.BillRepository;
import org.sid.billingservice.repository.ProductitemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BillRepository billRepository,
                            ProductitemRepository productitemRepository,
                            CustomerRestclient customerRestclient,
                            ProductitemRestClient productitemRestClient){
        return args -> {
            Customer customer = customerRestclient.getCustomerById(1L);
            System.out.println("-----------------------------");
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());
        };
    }

}
