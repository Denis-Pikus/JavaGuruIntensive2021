package dpdev.stock;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    private static final Logger log = LoggerFactory.getLogger(StockTest.class);
    private Stock stock;

    @BeforeEach
    void setup(){
        stock = new Stock("Google", 100.0);
    }

    @Test
    void printInformationAfterInitialization() {
        String expected = "Company = \"Google\", Current Price = 100.0$, Min Price = 100.0$, Max Price = 100.0$.";
        String actual = stock.printInformation();
        assertEquals(expected, actual);
        log.info("It's the history of price change: {}", stock.getListOfPrice().toString());
        log.info(stock.printInformation());
    }

    @Test
    void updatePrice() {
        double expected = 15.0;
        stock.updatePrice(15.0);
        double actual = stock.getCurrentPrice();
        log.info("It's the history of price change: {}", stock.getListOfPrice().toString());
        log.info("Current price = {}$", stock.getCurrentPrice());
        log.info(stock.printInformation());

    }

    @Test
    void getMinPrice() {
        double min = 2.0;
        double expected = 2.0;
        stock.updatePrice(min);
        double actual = stock.getMinPrice();
        assertEquals(expected, actual);
        log.info("It's the history of price change: {}", stock.getListOfPrice().toString());
        log.info("Minimal price = {}$", stock.getMinPrice());
        log.info(stock.printInformation());
    }

    @Test
    void getMaxPrice() {
        double expected = 200.0;
        stock.updatePrice(200);
        stock.updatePrice(50);
        double actual = stock.getMaxPrice();
        assertEquals(expected, actual);
        log.info("It's the history of price change: {}", stock.getListOfPrice().toString());
        log.info("Maximum price = {}$", stock.getMaxPrice());
        log.info(stock.printInformation());
    }
}