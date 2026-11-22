package semestr1.practice8;

public class Professor extends Person {
    private String academicTitle;
    private int publicationsCount;

    public Professor (String fullName, int birthYear,
                      String academicTitle,int publicationsCount){
        super( fullName,birthYear);
        this.academicTitle = academicTitle;
        this.publicationsCount = publicationsCount;
    }
    @Override
    public String toString(){
        return "Professor: " + getFullName() +
                ", academic title: " + academicTitle +
                ", publications: " + publicationsCount;
    }

}
