package OOPs;

public class Citizen extends Person {
	public int SSN;
	
	public Citizen() {
		
	}
	public Citizen(String name1, int age1, int SSN1, String CountryName1) {
		super();
		this.name=name1;
		this.age=age1;
		this.SSN=SSN1;
		this.CountryName=CountryName1;
	}
	public void displayAll() {
		System.out.println("Displaye details  "+name);
		System.out.println("Displaye details  "+age);
		System.out.println("Displaye details  "+SSN);
		System.out.println("Displaye details  "+CountryName);
	}
}

