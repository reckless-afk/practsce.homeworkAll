package semestr1.practice6;

public class GradeBook {
    private String studentName;
    private int[] grades;



    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }
    public double getAverage() {
       int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return (double) sum / grades.length;
    }
    public int getHighestGrade(){
        int max = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max){
                max = grades[i];
            }
        }
        return max;
    }
    public int getLowestGrade(){
        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
    public String getStudentName() {
        return studentName;
    }
    }



