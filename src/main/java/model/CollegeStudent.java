package model;

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

    private String createCollegeEmailAddress() {
        return getFirstName() + "." + getLastName() + "@gla.ac.in";
    }


}
