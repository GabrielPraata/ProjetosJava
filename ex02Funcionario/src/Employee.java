public class Employee {
    public String name;
    public double glossSalary;
    public double tax;

    public double NetSalary() {
        return glossSalary - tax;
    }
}
