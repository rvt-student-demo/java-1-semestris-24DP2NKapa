package rvt;

public class Astrology {
    public static void main(String[] args) {
        chrismasTree(100);
    }
    public static void printSpaces(double number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(double number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    public static void printTriangle(double size) {
        for (int i = 1; i < size+1; i++) {
            printSpaces(size-i);
            printStars(i);
            System.out.println();
        }
    }
    public static void chrismasTree(double height) {
        double i = 1;
        while (true) {
            printSpaces(height-i);
            printStars(i);
            printStars(i-1);
            System.out.println();
            i++;
            if (i > height) {
                printSpaces((i+i)/2-3);
                printStars(3);
                System.out.println();
                printSpaces((i+i)/2-3);
                printStars(3);
                break;
            }
        }
        
    }
}
