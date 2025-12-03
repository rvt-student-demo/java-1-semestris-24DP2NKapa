package rvt;

import java.util.*;

public class MainPaymentCard {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20, "Paul");
        PaymentCard mattsCard = new PaymentCard(30, "Matt");
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        

    }
}
