package OOPs;

public class RunnerClass {
	public static void main(String args[]) {
		/*Employee emp1= new Employee();
		emp1.Name ="Sreeja";
		emp1.empid=1200;
		emp1.displayName();
		
		Employee emp2= new Employee();
		emp2.Name ="Kurup";
		emp2.empid=1201;
		emp2.displayName();
		
		Employee emp3=new Employee("Ammu",1045);
		emp3.displayName();
		Employee.dispaySalary();*/
		
		Citizen C1= new Citizen();
		
		//Citizen C2= new Citizen("Sreeja",42,12365,"India");
		//C2.displayAll();
		
		Insurance in = new Insurance();
		in.name="Appu";
		in.CountryName="India";
		in.age=10;
		in.SSN=12020;
		in.insuranceID=100;
		in.displayAll();
		in.displayAll("Hello");
		EncapsulationExample emp =new EncapsulationExample();
		emp.setSalary(2500);
		System.out.println("Salary is " +emp.getSalary());
	
		
		
		
	}

}
