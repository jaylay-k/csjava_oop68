package packA;

public class Salesperson extends EmpTmp {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget) {
        super(n,exp,sal);
        this.target = assignedTarget;
    }
    public Salesperson(String n, int exp) {
        super(n);
        super.setExperience(exp);
    }
    public void setTaget(int target) {
        this.target = target;
    }
    public int getTarget() {
        return this.target;
    }
     public void setSalary() {
        super.salary *= 1.1;
    }
    @Override
    public void setSalary(int incresedAmount) {
        super.salary += incresedAmount;
    }
    public String makeQuotation() {
        return ("Dear value customer, " +(int)(1000 * Math.random()) + " is my best offer.");
    }
    @Override
    public String toString() {
        return ("[target=" + this.target + " " + super.toString() + " ]");
    }

}
