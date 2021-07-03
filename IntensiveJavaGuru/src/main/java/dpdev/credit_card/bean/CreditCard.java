package dpdev.credit_card.bean;

import java.util.Objects;

/*
Свойства

Номер карты
Пин-код карты
Баланс
Кредитный лимит
Задолженность по кредиту
Методы

Зачисление средств на карту ("deposit")
Снятие средств с карты ("withdraw")
 */
public class CreditCard {
    private final int cardNumber;
    private  int pin;
    private double balance;
    private double creditLimit;
    private double indebtedness;
    private boolean isBlocked;
    private int attempts;

    public CreditCard(int cardNumber, int pin) throws IllegalAccessException {
        this.cardNumber = cardNumber;
        if (String.valueOf(pin).length() == 4){
            this.pin = pin;
        }
        else throw new IllegalAccessException("Pin must consist of 4 numbers!");
        this.attempts = 3;
    }

    public int getPin() {
        return pin;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        if(indebtedness == 0) return balance;
        else return balance - indebtedness;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getIndebtedness() {
        return indebtedness;
    }

    public void setIndebtedness(double indebtedness) {
        this.indebtedness = indebtedness;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber && pin == that.pin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pin);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", indebtedness=" + indebtedness +
                '}';
    }
}
