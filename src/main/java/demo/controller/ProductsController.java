package demo.controller;

import demo.model.Product;
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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();

        return products;
    }

}
