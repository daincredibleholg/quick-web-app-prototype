package demo.controller;

import demo.domain.ProductService;
import demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller provides the REST methods
 */
@RestController
@RequestMapping("/api/products/")
public class ProductsController {

    // Let Spring DI inject the service for us
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        // Ask the data store for a list of products
        return productService.getProducts();
    }

}
