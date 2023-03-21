package OOPs;

public class Employee {
	public String Name;
	public int empid;
	private static int salary = 50000;

	public Employee() {

	}

	public Employee(String Name1, int empid1) {
		Name = Name1;
		empid = empid1;
	}

	public void displayName() {
		System.out.println("Name of the employee is  " + Name);
		System.out.println("ID of the employee is  " + empid);

	}
	public static void dispaySalary() {
		System.out.println("Salary of all employees "+salary);
		
	}

}
