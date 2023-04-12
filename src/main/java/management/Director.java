package management;

public class Director extends Manager{

    double Budget;

    public Director(String name, int NI, int salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        Budget = budget;
    }

    public double getBudget() {
        return Budget;
    }

    @Override
    public int payBonus(int salary){
        return salary / 50;
    }
}
