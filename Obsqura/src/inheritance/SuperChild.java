package inheritance;

public class SuperChild extends SuperParent {
	
	String a = "Hello";
	public void print()
	{
		
		System.out.println("SuperChild");
		System.out.println(super.a);
		
		super.display();
	}

	public SuperChild()
	{
		super();
		System.out.println("ChildClassConstructor");
	}
	public static void main(String[] args) {
		
		SuperChild ob = new SuperChild();
		ob.print();
		System.out.println(ob.a);
		ob.display();

	}

}
