package com.ecom.repository;

import com.ecom.model.dbmodel.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    <S extends Product> S save(S s);
}
