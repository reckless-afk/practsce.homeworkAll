package semestr1.practice8;

public class UniversityStudent extends Person {
    private String studentId;
    private String major;
    private int scholarship;

    public UniversityStudent(String fullName, int birthYear,
                             String studentId, String major, int scholarship) {
        super(fullName, birthYear);
        this.studentId = studentId;
        this.major = major;
        this.scholarship = scholarship;
    }
    @Override
    public String toString() {
        return "UniversityStudent: " + getFullName() +
                ", student ID: " + studentId +
                ", major: " + major +
                ", scholarship: " + scholarship;
    }

}
