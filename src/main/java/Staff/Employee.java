package Staff;

public abstract class Employee {
    private String name;
    private double salary;
    private int NI_num;

    public Employee(String name,double salary,int NI_num){
        this.name=name;
        this.salary=salary;
        this.NI_num = NI_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNI_num() {
        return NI_num;
    }

    public void setNI_num(int NI_num) {
        this.NI_num = NI_num;
    }

    public double increaseSalary(double amount){
        if(amount>0){return this.salary=this.salary+amount;}
        return this.salary;
    }

    public double payBonus(double percentage){
        return (this.salary*percentage-this.salary);
    }
}
