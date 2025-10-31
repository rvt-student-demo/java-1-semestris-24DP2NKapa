package rvt;

import java.util.*;

public class PaymentCard {
    private double balance;
    private String owner;

    public PaymentCard(double openingBalance, String owner) {
        this.balance = openingBalance;
        this.owner = owner;

    }

    public void eatAffordably() {
        // Spend € 2.60 on food
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // Spend € 4.60 on food
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }

    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;    
        }        
    }

    public String toString() {
        return owner + ": The card has a balance of " + balance + " euros";
    }
}
