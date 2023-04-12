package management;

import staff.Employee;

public class Manager extends Employee {
    String deptName;

    public Manager(String name, int NI, int salary, String deptName) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
