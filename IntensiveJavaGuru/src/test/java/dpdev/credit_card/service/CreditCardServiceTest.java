package dpdev.credit_card.service;

import dpdev.credit_card.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {
    private Logger log = LoggerFactory.getLogger(CreditCardServiceTest.class);
    private CreditCard creditCard;
    private CreditCardService creditCardService;

    @BeforeEach
    void setUp() throws IllegalAccessException {
        creditCard = new CreditCard(1111, 2211);
        creditCardService = new CreditCardService(creditCard);
        creditCard.setCreditLimit(300);
    }

    @Test
    void deposit() {
        double expected = 100.0;
        creditCardService.deposit(2211, 100.0);
        log.info("Balance is {}$", creditCard.getBalance());
        double actual = creditCard.getBalance();
        assertEquals(expected, actual, 2);
    }

    @Test
    void depositWhenBalanceIsNegative() {
        double expected = 50.0;
        creditCard.setIndebtedness(50);
        log.info("Balance is {}$, indebtedness is {}$", creditCard.getBalance(), creditCard.getIndebtedness());
        creditCardService.deposit(2211, 100.0);
        log.info("Balance after deposit is {}$, indebtedness after deposit is {}$", creditCard.getBalance(), creditCard.getIndebtedness());
        double actual = creditCard.getBalance();
        assertEquals(expected, actual, 2);
    }

    @Test
    void depositWhenBalanceIsNegativeAndIndebtednessMoreThenDeposit() {
        double expected = -50.0;
        double deposit = 100.0;
        creditCard.setIndebtedness(150);
        log.info("Balance is {}$, indebtedness is {}$", creditCard.getBalance(), creditCard.getIndebtedness());
        creditCardService.deposit(2211, deposit);
        log.info("Balance after deposit is {}$, indebtedness after deposit is {}$, deposit is {}$", creditCard.getBalance(),
                creditCard.getIndebtedness(), deposit);
        double actual = creditCard.getBalance();
        assertEquals(expected, actual, 2);
    }

    @Test
    void withdraw() {
        double expected = 50.0;
        double balance = 150;
        double withdraw = 100.0;
        creditCard.setBalance(balance);
        log.info("Balance is {}$.", creditCard.getBalance());
        creditCardService.withdraw(2211, withdraw);
        double actual = creditCard.getBalance();
        log.info("Balance after withdraw is {}$, withdraw is {}", creditCard.getBalance(), withdraw);
        assertEquals(expected, actual);
    }

    @Test
    void withdrawWhenWithdrawMoreThenBalance() {
        double expected = -50.0;
        double balance = 150;
        double withdraw = 200.0;
        creditCard.setBalance(balance);
        log.info("Balance is {}$.", creditCard.getBalance());
        creditCardService.withdraw(2211, withdraw);
        double actual = creditCard.getBalance();
        log.info("Balance after withdraw is {}$, withdraw is {}, indebtedness after withdraw is {}$.",
                creditCard.getBalance(), withdraw, creditCard.getIndebtedness());
        assertEquals(expected, actual);
    }

    @Test
    void withdrawWhenWithdrawMoreThenCreditLimit() {
        double withdraw = 400.0;
        log.info("Balance is {}$.", creditCard.getBalance());
        boolean actual = creditCardService.withdraw(2211, withdraw);
        log.info("Balance after withdraw is {}$, withdraw is {}, indebtedness after withdraw is {}$.",
                creditCard.getBalance(), withdraw, creditCard.getIndebtedness());
        assertFalse(actual);
    }

    @Test
    void pinCheckerTrue() {
        int pin = 2211;
        boolean actual = creditCardService.pinChecker(pin);
        assertTrue(actual);
        log.info("Pin is {}, you inputted pin {}.", creditCard.getPin(), pin);
    }

    @Test
    void pinCheckerFalse() {
        int pin = 1111;
        boolean actual = creditCardService.pinChecker(pin);
        assertFalse(actual);
        log.info("Pin is {}, you inputted pin {}.", creditCard.getPin(), pin);
    }

    @Test
    void attemptReduce() {
        log.info("Attempt's quantity is {}.", creditCard.getAttempts());
        int expected = 2;
        creditCardService.attemptReduce();
        int actual = creditCard.getAttempts();
        log.info("Attempt's quantity after reduce is {}.", creditCard.getAttempts());
        assertEquals(expected, actual);
    }

    @Test
    void attemptsReset() {
        creditCard.setAttempts(2);
        log.info("Attempt's quantity is {}.", creditCard.getAttempts());
        int expected = 3;
        creditCardService.attemptsReset();
        int actual = creditCard.getAttempts();
        log.info("Attempt's quantity after reset is {}.", creditCard.getAttempts());
        assertEquals(expected, actual);
    }
}