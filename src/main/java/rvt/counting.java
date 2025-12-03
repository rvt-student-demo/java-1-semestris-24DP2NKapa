package rvt;

import java.util.Scanner;

public class counting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many days you want convert to seconds? - ");
    int day = scanner.nextInt();
    int seconds = day * 24 * 60 * 60;
    System.out.println(seconds);
  }  
}
