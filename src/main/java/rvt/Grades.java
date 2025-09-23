package rvt;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = scanner.nextInt();
        String grade = "0";
        if (points < 0) {
            grade = "impossible!";
        } else if (points <= 49) {
            grade = "failed";
        } else if (points <= 59) {
            grade = "1";
        } else if (points <= 69) {
            grade = "2";
        } else if (points <= 79) {
            grade = "3";
        } else if (points <= 89) {
            grade = "4";
        } else if (points <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        } 
        System.out.println("Grade: " + grade);     
    }
}
