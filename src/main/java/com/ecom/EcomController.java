package com.ecom;

import com.ecom.constants.ControllerConstants;
import com.ecom.model.dbmodel.Product;
import com.ecom.services.NewProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(ControllerConstants.BASE_PATH)
public class EcomController {

    @Autowired
    private NewProductService newProductService;

    @RequestMapping(value = ControllerConstants.CREATE_PRODUCT, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> saveProduct(@RequestBody Product product, @RequestParam Map<String, String> requestHeaders){
        return newProductService.saveProduct(product);
    }

}
