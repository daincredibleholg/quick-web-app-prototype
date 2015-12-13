package demo.domain;

import demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface lets Spring generate a whole Repository implementation for
 * Products.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
