package model;

import javax.swing.*;
import java.util.Objects;

public class CollegeStudent extends Student {

    private boolean isPlaced; // wo college student place hai ya nahi
    private String collegeEmailAddress;

    public CollegeStudent(String firstName, String lastName, long rollNumber) {
        super(firstName, lastName, rollNumber);
        this.collegeEmailAddress = createCollegeEmailAddress();
        this.isPlaced = false;
    }

    public CollegeStudent(String firstName, String lastName, long rollNumber, String collegeEmailAddress, boolean isPlaced) {
        super(firstName, lastName, rollNumber);
        this.collegeEmailAddress = collegeEmailAddress;
        this.isPlaced = isPlaced;
    }

    public void study() {
        JOptionPane.showMessageDialog(null, "I am a college student.");
    }

    public void study(String subjectName) {
        JOptionPane.showMessageDialog(null, "I am a college student, studying " + subjectName + ".");
    }

    private String createCollegeEmailAddress() {
        return getFirstName() + "." + getLastName() + "@gla.ac.in";
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    public String getCollegeEmailAddress() {
        return collegeEmailAddress;
    }

    public void setCollegeEmailAddress(String collegeEmailAddress) {
        this.collegeEmailAddress = collegeEmailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CollegeStudent that = (CollegeStudent) o;
        return isPlaced == that.isPlaced && Objects.equals(collegeEmailAddress, that.collegeEmailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPlaced, collegeEmailAddress);
    }

    @Override
    public String toString() {
        return "CollegeStudent{" + "isPlaced=" + isPlaced + ", collegeEmailAddress='" + collegeEmailAddress + '\'' + '}';
    }
}
