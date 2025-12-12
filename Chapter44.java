import java.util.*;

public class Chapter44 {
    public static void main(String[] args) {
        ex6(args);
    }
    public static void ex1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String full = scanner.nextLine().trim();

        int spaceIndex = full.indexOf(" ");

        String first = full.substring(0, spaceIndex);

        String last = full.substring(spaceIndex + 1);

        last = last.toUpperCase();

        System.out.println();
        System.out.println(first + " " + last);
        
    }
    public static void ex2(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
    public static void ex3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> female = new ArrayList<String>();
        female.add("Amy");
        female.add("Buffy");
        female.add("Cathy");
        ArrayList<String> male = new ArrayList<String>();
        male.add("Elroy");
        male.add("Fred");
        male.add("Graham");
        while (true) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                break;
            }

            int spaceIndex = name.indexOf(" ");
            String firstName = name.substring(0, spaceIndex);

            if (male.contains(firstName)) {
                System.out.println("Mr. " + name);
            } else if (female.contains(firstName)) {
                System.out.println("Ms. " + name);
            } else {
                System.out.println(name);
            }    
        }
    }
    public static void ex4(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String digits = scanner.nextLine().trim();

        int len = digits.length();
        String minutes;
        String seconds;

        if (len <= 2) {
            minutes = "0";
            seconds = digits;
            if (seconds.length() == 1) {
                seconds = "0" + seconds;
            }
        } else {
            seconds = digits.substring(len - 2);
            minutes = digits.substring(0, len - 2);
        }

        System.out.println("Your time->  " + minutes + ":" + seconds);
    }
    public static void ex6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter password: ");
            String paswrd = scanner.nextLine();
            boolean isLong = paswrd.length() >= 7;
            boolean upperCase = !paswrd.toUpperCase().equals(paswrd);
            boolean lowerCase = !paswrd.toLowerCase().equals(paswrd);
            boolean hasDigit = false;
            for (int i = 0; i < paswrd.length(); i++) {
                if (Character.isDigit(paswrd.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (isLong) {
                if (upperCase) {
                    if (lowerCase) {
                        if (hasDigit) {
                            System.out.println("Acceptable password.");
                            break;
                        }
                    }
                }
            }

            System.out.println("That password is not acceptable.\n");
        }    
        
    }
    public static void ex7(String[] args) {
        System.out.print("Enter a word -->");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int helper = 0;
        for (int i = 0; i < word.length() - i; i++) {
            printSpaces(i);
            System.out.print(word.substring(helper, word.length() - i));
            System.out.println();
            helper++;
        }
    }
    public static void printSpaces(double number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
}
