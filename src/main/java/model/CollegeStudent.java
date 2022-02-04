package model;

public class CollegeStudent extends Student {

    private boolean isPlaced; // wo college student place hai ya nahi
    private String collegeEmailAddress;

    public CollegeStudent(String firstName, String lastName, long rollNumber) {
        super(firstName, lastName, rollNumber);
    }
}
