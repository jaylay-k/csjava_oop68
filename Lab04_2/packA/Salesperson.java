package packA;

public class Salesperson extends Employee implements SalesRoles {
    private int target;

    public Salesperson(String n, int exp, int sal)  {
        super(n, exp, sal);
    }

public void sayHi() {
        System.out.println("hi");
}
public void setSalary() {
        super.salary *= 1.1;
}
public void setSalary(int incresedAmount) {
        super.salary += incresedAmount;
}
public String makeQuotation() {
        return ("Dear value customer, " +(int)(1000 * Math.random()) + " is my best offer.");
}
}
