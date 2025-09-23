package rvt;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int boltPrice = 5;
        final int screwnutPrice = 3;
        final int paplaksnePrice = 1;
        System.out.println("Skruvju skaits: ");
        int boltCount = scanner.nextInt();
        System.out.println("Uzgrieznu skaits: ");
        int screwnutCount = scanner.nextInt();
        System.out.println("Paplaksnu skaits: ");
        int paplaksneCount = scanner.nextInt();
        int totalPrice = (boltPrice * boltCount) + (screwnutPrice * screwnutCount) + (paplaksnePrice * paplaksneCount);
        String state = "Pasutijums ir kartiba. \n";
        System.out.println("");
        if (screwnutCount < boltCount) {
            state = "Parbaudi pasutijumu: par maz uzgrieznu \n";
            System.out.println(state);
        }
        if ((paplaksneCount / 2) < boltCount) {
            state = "Parbaudi pasutijumu: par maz paplaksnu \n";
            System.out.println(state);
        }

        System.out.println("Kopeja cena: " + totalPrice);
    }
}
    
