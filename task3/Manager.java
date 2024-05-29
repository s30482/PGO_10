package task3;

import java.time.LocalDate;

public class Manager extends Employee{
    private double bonus;


    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public String toString(){
        System.out.println("Manager with last name " + lastName + " and age " + getAge() + " has salary " + getSalary());
        return null;
    }
}
