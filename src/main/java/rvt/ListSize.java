package rvt;

import java.util.*;

public class ListSize {
    public static void main(String[] args) {  
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
}
