package inheritance;

public class Manager extends Employee{

	String dept = "HR";
	
	public void displayManager()
	{
		System.out.println("Department : " + dept);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager ob = new Manager();
		ob.displayPerson();
		ob.displayEmployee();
		ob.displayManager();
	

	}

}
