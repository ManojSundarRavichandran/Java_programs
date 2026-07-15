public class Student{ // class declaration
    String name; // variable to store the name of the student
    int age;     // variable to store the age of the student
    int rollNumber; // variable to store the roll number of the student

    public void display(){ // method to display the student record
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student(); // object creation of StudentRecord class

        
        student.name = "John Doe";
        student.age = 20;
        student.rollNumber = 101;

        student.display();
    }
}