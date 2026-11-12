package packA;

public class Programmer extends EmpTmp {

public Programmer(String n, int exp, int sal) {
    super(n,exp,sal);
}
@Override
public String toString() {
    return "Name=" + super.name + " Salary=" + super.salary + " Experience=" + super.experience;
}
@Override
public void sayHi() {
    System.out.println("hi from " + super.name);
}
public String coding() {
    return ("I am coding");
    }
}
