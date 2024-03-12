package com.starter.crud.demo.app.repo;

import com.starter.crud.demo.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional("tm2")
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
