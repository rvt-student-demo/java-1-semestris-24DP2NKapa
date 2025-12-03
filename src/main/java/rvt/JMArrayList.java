package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        RemoveLast(null);
    }
    public static void OnlyTheseNumbers(String[] args) {
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
    public static void ListSize(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String elm = "";
        while (true) {
        elm = scanner.nextLine();
        if (elm == "") {
            break;
        }
        names.add(elm);
        }
        System.out.println("In total: " + names.size());
    }
    public static void OnTheList(String[] args) {
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
    public static void RemoveLast(ArrayList<String> strings) {
        strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> array) {
        int size = array.size();

        array.remove(size-1);
    }
}
