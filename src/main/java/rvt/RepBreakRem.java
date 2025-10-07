package rvt;

import java.util.Scanner;

public class RepBreakRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int amount = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers:");
        while (true) {
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num%2 == 1) {
                odd ++;
            } else {
                even ++;
            }
            sum += num;
            amount ++;
        }
        double average = sum/(amount * 1.0);
        System.out.println("Thx! Bye! \n Sum: " + sum + "\nNumbers: " + amount + "\nAmount: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}