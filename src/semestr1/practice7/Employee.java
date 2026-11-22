package semestr1.practice7;

    public class Employee {
        private int id;
        private String fullName;
        private String position;
        private double monthlySalary;

        public Employee(int id, String fullName, String position, double monthlySalary) {
            this.id = id;
            this.fullName = fullName;
            this.position = position;
            this.monthlySalary = monthlySalary;
        }

    public void raiseSalary(double percent) {
        monthlySalary = monthlySalary + (monthlySalary * percent / 100);

    }
    public double getAnnualSalary(){
        return  monthlySalary * 12;
    }
    public void printBadge(){
        System.out.println(fullName);
        System.out.println(id);
        System.out.println(position);
        System.out.println(monthlySalary);
    }
}
