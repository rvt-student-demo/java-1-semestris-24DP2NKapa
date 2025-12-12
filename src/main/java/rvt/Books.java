package rvt;

import java.util.*;

public class Books {
    private String title;
    private int pages;
    private int pub_year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.pub_year = year;
    }

    public void printAll() {
        System.out.print(this.title + ", ");
        System.out.print(this.pages + " pages, ");
        System.out.print(this.pub_year);
    }

    public void printTitle() {
        System.out.println(this.title);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> library = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String new_title = scanner.nextLine();

            if (new_title.isEmpty()) {
                System.out.print("What information will be printed? ");
                String info = scanner.nextLine();

                if (info.equals("name")) {
                    for (Books b : library) {
                        b.printTitle();
                        System.out.println();
                    }
                } else if (info.equals("everything")) {
                    for (Books b : library) {
                        b.printAll();
                        System.out.println();
                    }
                } else {
                    System.out.println("Please pick valid option!");
                }

                break;
            }

            System.out.print("Pages: ");
            int new_pages = scanner.nextInt();

            System.out.print("Publication year: ");
            int new_year = scanner.nextInt();

            scanner.nextLine();

            library.add(new Books(new_title, new_pages, new_year));
        }
    }
}
