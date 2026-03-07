package basic;

public class DefConVal {

    public static void main(String[] args) {

        // Employee e = new Employee();
        // e.display();
        // Student s = new Student();
        // s.display();
        Student s = new Student("Ram", 15, 8, 'A');
        s.display();

        System.out.println("-----------");

        Student s2 = new Student("sita", 14, 6, 'B');
        s2.display();
    }
}

class Employee {

    String firstName; //null
    String lastName; //null 

    //primitive 
    byte bonus;//0
    short salesBonus;//0
    char gender;//null char 
    int salary;//0
    long tax;//0 
    float leavePropb;//0.0
    double targetProb;//0.0 
    boolean active;//false 

    //constructor -> 
    //1) implicit 
    //2) explicit 
    //2.1   : default  / no args / 
    //2.2   : parameterized / argument 
    //constructor is a special method , which has same name as class name 
    //      and it must not have any return type 
    // it is used to initialize the instance variable. 
    //we have two types of constructor 
    //default , parameterized 
    //constructor will call when we create instance. 
    Employee() {
        bonus = 10;
        salary = 25000;
    }

    void display() {
        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(bonus);
        System.out.println(salesBonus);
        System.out.println(gender);
        System.out.println(salary);
        System.out.println(tax);
        System.out.println(leavePropb);
        System.out.println(targetProb);
        System.out.println(active);
    }

}

/*

    class : Student
    variable : name,age,standard,stream
    constructor : will assign values to all variables 
    method : which prints all the values    

 */
class Student {

    String name;
    int age;
    int standard;
    char stream;

    Student() {
        name = "rock";
        age = 19;
        standard = 12;
        stream = 'B';
    }

    Student(String localName, int a, int std, char stream) {
        name = localName;
        age = a;
        standard = std;
        this.stream = stream; //this keyword - refere current instance 
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(standard);
        System.out.println(stream);
    }
}
