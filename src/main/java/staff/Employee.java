package staff;

public abstract class Employee {
    String name;
    int NI;
    int salary;

    public Employee(String name, int NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        if(increment > 0) {
            salary += increment;
        }
    }

    public int payBonus(int salary){
        return salary / 100;
    }

    public void changeName(String name) {
        if(name != null){
            this.name = name;
        }
    }
}
