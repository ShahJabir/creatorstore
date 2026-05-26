package bd.com.shahjabir.creatorstudio.repositories;

import bd.com.shahjabir.creatorstudio.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
