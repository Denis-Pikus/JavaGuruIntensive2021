package dpdev.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Logger logger = LoggerFactory.getLogger(ShopTest.class);
    Shop shop = new Shop();;
    @BeforeEach
    void setup() {
        List<Product> list = List.of(
        new Product("mushrooms", new BigDecimal("3.0")),
        new Product("coconut", new BigDecimal("5.0")),
        new Product("apple", new BigDecimal("2.0")),
        new Product("mango", new BigDecimal("10.0"))
        );
        shop.setProductList(list);
        logger.info(shop.getProductList().toString());

    }

    @Test
    void addProduct() {
        int expected = 5;
        shop.addProduct(new Product("mushrooms", new BigDecimal("3.0")));
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void addProductNull() {
        int expected = 0;
        logger.info(shop.getProductList().toString());
        shop.addProduct(null);
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void removeProduct() {
        int expected = 1;
        shop.addProduct(new Product("mushrooms", new BigDecimal("3.0")));
        shop.addProduct(new Product("coconut", new BigDecimal("5.0")));
        logger.info(shop.getProductList().toString());
        shop.removeProduct(new Product("mushrooms", new BigDecimal("3.0")));
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void removeProductNull() {
        int expected = 1;
        shop.addProduct(new Product("mushrooms", new BigDecimal("3.0")));
        logger.info(shop.getProductList().toString());
        shop.removeProduct(null);
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void findProductByName() {
        shop.addProduct(new Product("mushrooms", new BigDecimal("3.0")));
        shop.addProduct(new Product("coconut", new BigDecimal("5.0")));
        shop.addProduct(new Product("apple", new BigDecimal("2.0")));
        shop.addProduct(new Product("mango", new BigDecimal("10.0")));
        logger.info(shop.getProductList().toString());
        Product product = shop.getProductList().get(2);
        Product product1 = shop.findProductByName("apple");
        assertEquals(product, product1);
        logger.info("expected = {}", product.toString());
        logger.info("result = {}", product1.toString());
    }

    @Test
    void findProductByRangeOfPrice() {


    }
}