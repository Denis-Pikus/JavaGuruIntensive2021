package dpdev.credit_card.service;

import dpdev.credit_card.bean.CreditCard;

public class CreditCardService {
    private CreditCard creditCard;

    public CreditCardService(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public boolean deposit(int pin, double amount) {
        if (pinChecker(pin)) {
            if (creditCard.getIndebtedness()!= 0){
                if (creditCard.getIndebtedness() < amount){
                    creditCard.setBalance(amount - creditCard.getIndebtedness());
                    creditCard.setIndebtedness(0);
                    return true;
                }
               else {
                    creditCard.setIndebtedness(creditCard.getIndebtedness() - amount);
                    return true;
                }
            }
            else {
                creditCard.setBalance(creditCard.getBalance() + amount);
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(int pin, double amount) {
        if (pinChecker(pin)) {
            if (creditCard.getBalance() > 0){
                if (creditCard.getBalance() > amount){
                    creditCard.setBalance(creditCard.getBalance() - amount);
                    return true;
                }
                else {
                    double secondBalance = amount - creditCard.getBalance();
                    if (secondBalance < creditCard.getCreditLimit()){
                        creditCard.setBalance(0.0);
                        creditCard.setIndebtedness(secondBalance);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean pinChecker(int pin) {
        if (String.valueOf(pin).length() == 4 && creditCard.getPin() == pin) {
            if (creditCard.isBlocked()) {
                attemptsReset();
            }
            return true;
        } else {
            attemptReduce();
            if (creditCard.getAttempts() == 0)
                creditCard.isBlocked();
            return false;
        }
    }

    public void attemptReduce() {
        creditCard.setAttempts(creditCard.getAttempts() - 1);
    }

    public void attemptsReset() {
        creditCard.setAttempts(3);
    }
}
