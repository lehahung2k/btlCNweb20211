package cnweb20211.soict.shopapi.repository;

import cnweb20211.soict.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}
