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
    Shop shop = new Shop();
    ;

    @BeforeEach
    void setup() {
        shop.getProductList().add(new Product("mushrooms", new BigDecimal("3.0")));
        shop.getProductList().add(new Product("coconut", new BigDecimal("5.0")));
        shop.getProductList().add(new Product("apple", new BigDecimal("2.0")));
        shop.getProductList().add(new Product("mango", new BigDecimal("10.0")));
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
        int expected = 4;
        logger.info(shop.getProductList().toString());
        shop.addProduct(null);
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void removeProduct() {
        int expected = 3;
        Product product = new Product("mushrooms", new BigDecimal("3.0"));
        logger.info("current list size = {}", shop.getProductList().size());
        shop.removeProduct(product);
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
        logger.info("result list size = {}", shop.getProductList().size());

    }

    @Test
    void removeProductNull() {
        int expected = 4;
        shop.removeProduct(null);
        assertEquals(expected, shop.getProductList().size());
        logger.info(shop.getProductList().toString());
    }

    @Test
    void findProductByName() {
        logger.info(shop.getProductList().toString());
        Product product = shop.getProductList().get(2);
        Product product1 = shop.findProductByName("apple");
        assertEquals(product, product1);
        logger.info("expected = {}", product.toString());
        logger.info("result = {}", product1.toString());
    }

    @Test
    void findProductByRangeOfPrice() {
        Product[] arrayOfProduct = new Product[3];
        for (int i = 0; i < shop.getProductList().size() - 1; i++) {
            arrayOfProduct[i] = shop.getProductList().get(i);
        }
        logger.info("expected list = {}", Arrays.toString(arrayOfProduct));
        List<Product> listOfSearchProduct = shop
                .findProductByRangeOfPrice(new BigDecimal("2.0"), new BigDecimal("5.0"));
        Product[] result = listOfSearchProduct.toArray(new Product[listOfSearchProduct.size()]);
        assertArrayEquals(arrayOfProduct, result);
        logger.info("actual list = {}", Arrays.toString(result));

    }
}