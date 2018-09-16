package com.example.demo.email;

import com.example.demo.customer.Customer;

public interface EmailService {
    void sendMessageToCustomer(Customer customer);
}
