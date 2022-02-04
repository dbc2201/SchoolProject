package model;

import javax.swing.*;
import java.util.Objects;

// college student, school student, projects, assignments, attendance, placement
// intelligent, average, low

public class Student {
    private String firstName;
    private String lastName;
    private long rollNumber;

    public Student(String firstName, String lastName, long rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }

    public void study() {
        JOptionPane.showMessageDialog(null, "I am studying...");
    }

    public void study(String subjectName) {
        JOptionPane.showMessageDialog(null, "I am studying " + subjectName + ".");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", rollNumber=" + rollNumber + '}';
    }
}
