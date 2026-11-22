package semestr1.practice8;
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);

        if (programmingLanguage != null) {
            this.programmingLanguage = programmingLanguage;
        } else {
            this.programmingLanguage = "Unknown";
        }
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", зарплата: " + salary +
                ", язык программирования: " + programmingLanguage;
    }

}
