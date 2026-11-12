package packA;

public class Accountant extends Employee {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    public Accountant(String n, int exp, int sal) {
        super(n, exp, sal);
    }

public String tellProfit() {
    return (companyName + "'s profit is " + (int)(1000 * Math.random()) + ". My salary is " + this.salary);
}
@Override
public void sayHi() {
    System.out.println(super.name + " an accoutant,say hello");
}
public static String tellMyRole() {
    return ("I am accountant at " + companyName);
}
}   