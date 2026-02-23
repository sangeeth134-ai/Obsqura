package inheritance;

public class ChildClass  extends ParentClass {

	public void print()
	{
		System.out.println("ChildClass");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass ob = new ChildClass();
		System.out.println(ob.s);
		ob.add();
		ob.print();
		
		//ParentClass ob1 = new ParentClass();
		//ob1.add();

	}

}
