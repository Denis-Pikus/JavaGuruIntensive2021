package dpdev.product;

import dpdev.homework_1.operations.Calculator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {
    Logger log = LoggerFactory.getLogger(ProductTest.class);
    Product product = new Product("Apple");

    @Test
    void actualPrice() throws IllegalAccessException {
        double expected = 0.8;
        product.setRegularPrice(2.0);
        product.setDiscount(10);
        double actual = product.actualPrice();
        assertEquals(expected, actual, 2);
        product.printInformation();
    }

    @Test
    void setRegularPriceException() {
        assertThrows(IllegalArgumentException.class, () -> product.setRegularPrice(-1.0));
        log.info("You inputted wrong argument!");
    }

    @Test
    void setDiscountException() {
        assertThrows(IllegalArgumentException.class, () -> product.setDiscount(-1.0));
        log.info("You inputted wrong argument!");
    }
}