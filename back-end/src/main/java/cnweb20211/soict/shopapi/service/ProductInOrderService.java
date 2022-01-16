package cnweb20211.soict.shopapi.service;

import cnweb20211.soict.shopapi.entity.ProductInOrder;
import cnweb20211.soict.shopapi.entity.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
