package cnweb20211.soict.shopapi.service;

import cnweb20211.soict.shopapi.entity.User;
import cnweb20211.soict.shopapi.entity.Cart;
import cnweb20211.soict.shopapi.entity.ProductInOrder;

import java.util.Collection;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
