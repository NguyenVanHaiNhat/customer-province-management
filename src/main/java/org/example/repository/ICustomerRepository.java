package org.example.repository;

import org.example.model.Customer;
import org.example.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
//    @Query(value = "", nativeQuery = true)
    Iterable<Customer> findAllByProvince(Province province);
}
