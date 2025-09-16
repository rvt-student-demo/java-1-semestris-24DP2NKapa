package rvt;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzraksti produkta nosaukumu: ");
        String name = scanner.nextLine();
        System.out.println("Uzraksti produkta skaitu: ");
        int amount = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzraksti produkta cenu: ");
        double price = Double.valueOf(scanner.nextLine());
        System.out.println(name + " cena: " + price + " " + amount + " totalPrice: " +  price * amount);
    }
}
