package Management;

import Staff.Employee;

public class Director extends Employee {
    private double budget;

    public Director(String name, double salary, int NI_num, double budget) {
        super(name, salary, NI_num);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double setBudget(double amount) {
        this.budget = amount;
        return this.budget;
    }


}
