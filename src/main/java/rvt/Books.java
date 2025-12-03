package rvt;

import java.util.*;

public class Books {
    private String title;
    private int pages;
    private int publication_year;
    ArrayList<String> books = new ArrayList<>();

    public Books() {
        this.title = title;
        this.pages = pages;
        this.publication_year = publication_year;
    }
    public void printInfo() {
        Scanner scanner = new Scanner(System.in);

    }
    public void readFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userinp = scanner.nextLine();
            System.out.print("Title: ");
            //title = ;
            books.add(userinp);
            System.out.print("Pages: ");
            System.out.print("Publication year: ");
        }
    }

    public static void main(String[] args) {
        Books books = new Books();
    }
}
