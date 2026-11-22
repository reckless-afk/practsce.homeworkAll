package semestr1.practice8;

public class Student {

    private String name;
    private int course;
    private double gpa;

    public Student(String name, int course, double gpa) {
        this.name = name;

        if (course >= 1 && course <= 6) {
            this.course = course;
        } else {
            this.course = 1;
        }

        if (gpa >= 0.0 && gpa <= 100.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 60.0;
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 6) {
            this.course = course;
        } else {
            this.course = 1;
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 100.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 60.0;
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name +
                "', course=" + course +
                ", gpa=" + gpa + "}";
    }
}