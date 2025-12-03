package rvt;

import java.util.Scanner;

public class TestYomayo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number: ");
            int usernum = scanner.nextInt();
            if (usernum > 0) {
                System.out.println(usernum * usernum);
            } else if (usernum < 0) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }
        }
    }
}
