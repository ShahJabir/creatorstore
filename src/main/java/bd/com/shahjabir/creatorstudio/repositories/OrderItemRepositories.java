package bd.com.shahjabir.creatorstudio.repositories;

import bd.com.shahjabir.creatorstudio.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Long> {
}
