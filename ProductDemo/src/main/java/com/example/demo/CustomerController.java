package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class CustomerController {
	private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customers")
    public String main(Model model) {
        model.addAttribute("customers", customerService.mockCustomers());

        return "customers";
    }

}
