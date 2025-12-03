package rvt;

import java.util.Scanner;

public class printword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word ");
        String word = scanner.nextLine();
        int times = word.length();
        int count = 0;
        while (times > count) {
            System.out.println(word);
            count ++;
        }
    }
}
