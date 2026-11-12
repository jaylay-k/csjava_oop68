package packA;
import java.util.ArrayList;

public class Programmer extends Employee {
    private ArrayList<String> skills;

    public Programmer (String n, int exp, int sal) {
        super(n,exp,sal);
}
public void sayHi() {
    System.out.println("hi from " + super.name);
}
public String coding() {
    return ("I am coding");
}
public ArrayList<String> getSkills() {
    return (this.skills);
}
public void setSkills(ArrayList<String> newSkills) {
    this.skills = newSkills;
}
}
