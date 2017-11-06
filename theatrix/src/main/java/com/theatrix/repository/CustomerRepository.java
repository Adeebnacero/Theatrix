package com.theatrix.repository;

import com.theatrix.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 07/08/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>{

}
