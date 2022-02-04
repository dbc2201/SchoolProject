package main;

import model.CollegeStudent;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Divyansh", "Bhardwaj", 123456789L);

        student.study();

        CollegeStudent collegeStudent = new CollegeStudent(
                "vishad",
                "vashishtha",
                123456789L,
                "vishad.vashistha@gla.ac.in",
                true
        );

        collegeStudent.study("Java Programming");

        Student student1 = new CollegeStudent("deepanshu", "sharma", 4567813L);
        // object: CollegeStudent
        // reference variable: Student
        // Student (referenceVariable) -> CollegeStudent (object)
        // Overloading -> Compile-Time Polymorphism
        // Dynamic Method Dispatch - Runtime Polymorphism (Overriding)
        student1.study();
    }
}
