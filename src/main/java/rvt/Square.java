package rvt;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int sum = 0;
        int start = 1;
        while (start < n+1) {
            sum += start * start;          
            start ++; 
        }
        System.out.println(sum);
    }
}
