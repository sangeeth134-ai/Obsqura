package stringclass;

public class StringBufferSample {

	public static void main(String[] args) {
		StringBuffer ob = new StringBuffer("Hello");
		System.out.println(ob);
		
		//append()
		ob.append("world");
		System.out.println(ob);
		
		//insert()
		ob.insert(5, "Hi");
		System.out.println(ob);
		
		//replace()
		ob.replace(6, 9,"GoodMorning" );
		System.out.println(ob);
		
		//delete()
		ob.delete(0,7);
		System.out.println(ob);
		
		//reverse()
		ob.reverse();
		System.out.println(ob);
		
	}

}