class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }

    /*------------------------------Constructor------------------------------------- */
    /*  Constructor calls only once in a class & don't need to write return type.
        If user don't call constructor then java automatically call the constructor itself.
    */

    // ** Define Non-paramterized Constructor :-
    Student() {
        System.out.println("Explicitly default constructor called");
    }

    // ** Define Parameterized Constructor :-
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ** Define Copy Constructor :-
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
} 

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dip";
        s1.age = 22;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "gon";
        s2.age = 21;
        s2.printInfo();

    //calling parametrised constructor
        Student s3 = new Student("Adi", 20);
        s3.printInfo();

    //calling copy constructor
        Student s4 = new Student(s2);
        s4.printInfo();

    }
}