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