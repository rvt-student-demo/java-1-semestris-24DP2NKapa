package rvt;

import java.util.*;

public class OnTheList {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            String elem = scanner.nextLine();
            if (elem.equals("")) {
                break;
            }
            people.add(elem);           
        }
        System.out.print("Search for? ");
        String target = scanner.nextLine();
        if (people.contains(target)) {
            System.out.println(target + " was found!");
        } else {
            System.out.println(target + " was not found!");
        }
    }
}
