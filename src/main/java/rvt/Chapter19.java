package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex1(args);
    }
    public static void ex1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start:");
        int start = scanner.nextInt();
        System.out.println("Enter End:");
        int end = scanner.nextInt();
        System.out.println();
        while (start < end+1) {
            System.out.println(start);
            start ++;
        }
        
    }
    public static void ex2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int sumOfIntegers = (n*(n+1))/2;
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
        }
        System.out.println("Loop sum = " + sum);
        System.out.println("Formula sum = " + sumOfIntegers);
        
    }
    public static void ex3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int sum = 0;
        int start = 1;
        int sumOfSquares = (n*(n+1)*(2*n+1))/6;
        while (start < n+1) {
            sum += start * start;          
            start ++; 
        }
        System.out.println("Loop sum = " + sum);
        System.out.println("Formula sum = " + sumOfSquares);
    }
    public static void ex4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low:");
        int low = scanner.nextInt();
        System.out.println("Enter high:");
        int high = scanner.nextInt();
        int sum = 0;
        for (int i = low; i < high+1; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);        
    }
    public static void ex5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String inputString = scanner.nextLine();
        int times = inputString.length();
        System.out.println();
        for (int i = 1; i < times+1; i++) {
            System.out.println(inputString);            
        }
        
    }
    public static void ex6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();
        int dotAmount = 30 - firstWord.length() - secondWord.length();
        String dots = "";
        for (int i = 1; i < dotAmount; i++) {
            dots += ".";
        }
        System.out.println(firstWord + dots + secondWord);
    }
    public static void ex7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String aWord = scanner.nextLine();
        int times = aWord.length();
        for (int i = 0; i < times; i++) {
            System.out.println(aWord.charAt(i));
        }
        
    }
}