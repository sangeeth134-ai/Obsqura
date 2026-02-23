package inheritance;

public class hierarchicalChild2 extends hierarchicalParent{

	public void sub()
	{
		
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hierarchicalChild2 obj2 = new hierarchicalChild2();
		obj2.display();
		obj2.sub();

	}

}
