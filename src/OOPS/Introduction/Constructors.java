package OOPS.Introduction;


class Student{
    String name;
    int age;

    //default constructor
    Student(){
        this.name="Manikanta";
        this.age=21;
    }

    //parameterized constructor
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //copy constructor
    Student(Student other){
        this.name=other.name;
        this.age=other.age;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Constructors {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.display();

        Student s2=new Student("Mahesh",24);
        s2.display();

        Student s3=new Student(s2);
        s3.display();

    }
}
