package demo.domain;

import demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is a little service class we will let Spring inject later.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

}
