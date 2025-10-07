package rvt;

public class FromParToOne {
    public static void main(String[] args) {
        printFromParameterToOne(5);
    }
    public static void printFromParameterToOne(int param) {
        for (int i = param; i > 0; i--) {
            System.out.println(i);
        }
    }
}
