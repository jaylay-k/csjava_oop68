package packA;

public class ProgrammerManager extends Programmer implements ManagerRoles {
	public ProgrammerManager(String n, int exp, int sal) {
		super(n,exp,sal);
}
@Override
public void sayHi() {
    System.out.println("From sayHi, I know " + super.getSkills());
}
public int evaluate(Programmer p) {
	p.salary += (p.salary * 0.15);
	return (p.salary);
}
@Override
public String coding() {
	return ("I am manager");
}
@Override
public String toString() {
	return ("ManagerProgrammer [name=" + super.name + ", experience=" + super.experience + ", salary=" + super.salary + "]");
} 
}
