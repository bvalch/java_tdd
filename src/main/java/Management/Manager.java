package Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, double salary, int NI_num,String deptName) {
        super(name, salary, NI_num);
        this.deptName=deptName;

    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
