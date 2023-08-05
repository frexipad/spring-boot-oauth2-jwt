package com.frexdel.logistic.web;

import com.frexdel.logistic.dao.CustomerRepository;
import com.frexdel.logistic.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerTest {

    private CustomerRepository customerRepository;
@GetMapping("/customers")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
}
