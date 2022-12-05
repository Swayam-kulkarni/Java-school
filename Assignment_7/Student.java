package Assignment_7;

public class Student {
    int id;
    String name;
    int age;
    //creating two arg constructor 
    Student(){
        System.out.println(" ID\tNAME\tAGE"); 
    }
    //creating three arg constructor 
    Student(int i, String n, int a){
        id = i; name = n; age = a;
    }
    void display(){
        System.out.println(" "+id+"\t"+name+"\t"+age); 
    }

    public static void main(String args[]){ 
        Student s = new Student();
        Student s1 = new Student(101,"Karan",20); 
        Student s2 = new Student(102,"Aryan",22); 
        Student s3 = new Student(503,"Pritesh",18); 
        Student s4 = new Student(301,"Sanket",19);
        Student s5 = new Student(202,"Ruchit",15); 

        // s.display();
        s1.display();
        s2.display();
        s3.display();
        s4.display(); 
        s5.display();
    }
}
