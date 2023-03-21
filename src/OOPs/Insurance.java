package OOPs;

public class Insurance extends Citizen{
	public int insuranceID;
	
	public void displayAll() {
		super.displayAll();
		System.out.println("insurance id is "+insuranceID);
	}
	public void displayAll(String message) {
		
		System.out.println("message is  "+message);
	}

}
