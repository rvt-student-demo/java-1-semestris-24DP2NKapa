package rvt;

public class Student {
    // nav statc
    private String name;
    private String surname;
    private int age;
    private String email;
    //static
    private static String school = "RVT";

    public Student(String name, String surname, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceYourSelf() {
        System.out.println(
            "My name is " + name  + " and I am " + age + " years old in " + school
        );
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String s) {
        this.surname = s; 
    }

    public static void main(String[] args) {
        Student st1 = new Student("Osama", "Mahmudalaev", 16);
        st1.introduceYourSelf();
        System.out.println(st1.school);
        st1.school = "RTK";
        System.out.println(Student.school);

        Student st2 = new Student("Adolf", "Friedrichwulz", 16);
        System.out.println(st2.school);

        Student st3 = new Student("Benito", "Esposito", 16);
        System.out.println(st3.school);
        hey();
        // hello(); NOOOO!!!!
        st1.hello(); // YES!!!
    }
    public static void hey() {
        System.out.println("Hey");
    }
    public void hello() {
        System.out.println("Hello");
    }
}
