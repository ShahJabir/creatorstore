package bd.com.shahjabir.creatorstudio.repositories;

import bd.com.shahjabir.creatorstudio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
