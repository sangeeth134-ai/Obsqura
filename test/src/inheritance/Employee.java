package inheritance;

public class Employee extends Person {

	String EmployeeId = "Emp001";
	int Salary = 20000;
	
	public void displayEmployee()
	{
		
		System.out.println("Employeer ID : " + EmployeeId);
		System.out.println("Salary :" + Salary);
		
		
	}
	
}
