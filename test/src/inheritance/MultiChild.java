package inheritance;

public class MultiChild  extends MultiParent{

	float f = 56.7f;
	public void div()
	{
		int m = 10;
		System.out.println(m/2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiChild ob2 = new MultiChild();
		System.out.println(ob2.a);
		ob2.sub();
		System.out.println("");
		System.out.println(ob2.k);
		ob2.display();
		System.out.println("");
		ob2.div();
		System.out.println(ob2.f);

	}

}
