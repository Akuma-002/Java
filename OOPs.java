public class OOPs {
    public static void main(String [] args){
        Student s1 = new Student("sahil", 23);
        System.out.println(s1.roll);
    }
}


class Student {
    String name;
    int roll;
    //Non parameter
    Student (){
        System.out.println("Hello");
    }
    //Parameter
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    //Copy
    Student(Student temp){
        this.name = temp.name;
        this.roll = temp.roll;
    }
}

//Inheritence
    // Base class

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}
//Derived class
class Fish extends Animal{
    
}

//Abstarct class
abstract class A{
    String name;
    void print(){
        System.out .println("Hi");
    }

    abstract void walk();
}

class B extends A{
    void walk(){
        System.out.println("Can walk");
    }
}


//Interfaces
interface Player{
    void move();
}

class Queen implements Player{
    public void move(){
        System.out.println("Move");
    }
}