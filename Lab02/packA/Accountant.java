package packA;

public class Accountant extends Programmer {
    private static String    companyName = "berk barn jamkad";
    private int                experience;
    private String            specialty;

    public Accountant(String name, int superExp, int experience, int sal, String talent) {
        super(name, superExp, sal);
        this.experience = experience;
        this.specialty = talent;
    }

    public void setSpecialty(String newSpecialty) {
        this.specialty = newSpecialty;
    }

    public String getSpecialty() {
        return (this.specialty);
    }

    public void setAccountExperiance(int exp) {
        this.experience = exp;
    }

    public int getAccountExperiance() {
        return (this.experience);
    }

    public String tellProfit() {
        return (companyName + "'s profit is " + (int)(1000 * Math.random()) + ". My salary is " + this.salary);
    }

    @Override
    public String toString() {
        return ("Accountant [experience=" + this.experience + ", specialty=" + this.specialty + "]");
    }

    @Override
    public void sayHi() {
        System.out.println(super.getName() + " says hello");
    }

    public static String tellMyRole() {
        return ("I am accountant at " + companyName);
    }
}