package rvt;

import java.util.*;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> names = new ArrayList<Integer>();
        int elm = 0;
        while (true) {
            elm = scanner.nextInt();
            if (elm == -1) {
                break;
            }
            names.add(elm);
        }
        System.out.print("From where? ");
        int from = scanner.nextInt();
        System.out.print("To where? ");
        int to = scanner.nextInt();
        for (int i = from; i < to+1; i++) {
            System.out.println(names.get(i));
        }
    }
}
