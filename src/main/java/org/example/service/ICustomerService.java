package org.example.service;

import org.example.model.Customer;
import org.example.model.Province;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
