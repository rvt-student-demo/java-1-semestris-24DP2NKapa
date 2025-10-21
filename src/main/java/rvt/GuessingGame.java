package rvt;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int CPUnumber = random.nextInt(10) + 1;
        // random.nextInt(6);   -   0 - 5
        int guessAmount = 0;
        System.out.println("Es domaju par skaitli no 1 lidz 10");
        System.out.println("Tev jauzmin tris meģinajumos");
        System.out.println("Ievadi minejumu:");
        while (true) {
            int guess = scan.nextInt();
            if (guess == CPUnumber) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarejis speli");
                break;
            } else {
                System.out.println("nepareizi");
                guessAmount++;
            }
            if (guessAmount == 3) {
                System.out.println("Pareizais skaitlis bija " + CPUnumber);
                System.out.println("Tu esi zaudejis speli");
                break;                
            }
        }
    }
}
