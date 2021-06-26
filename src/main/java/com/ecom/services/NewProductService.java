package com.ecom.services;

import com.ecom.model.dbmodel.Product;
import com.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NewProductService {

    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<Product> saveProduct(Product product) {

        Product productResp = null;
        try {

            /**
             * Validation
             */
            productResp = productRepository.save(product);

            /**
             * Exceptoin handling for product
             */
        } catch (Exception e) {

        }

        return new ResponseEntity<>(productResp, null, HttpStatus.OK);


    }
}
