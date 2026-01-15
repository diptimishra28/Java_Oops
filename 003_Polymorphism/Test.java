class Student{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.print(this.name + " ");
        System.out.println(this.age);
    }
}


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "dip";
        s1.age = 22;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}