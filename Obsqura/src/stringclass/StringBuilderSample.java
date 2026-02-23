package stringclass;

public class StringBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ob1 = new StringBuilder("Hello");
		
		//append 
		ob1.append("world");
		System.out.println(ob1);
		
		//insert
		ob1.insert(5,"Hello");
		System.out.println(ob1);
		
		//replace
		ob1.replace(5,10,"Hi");
		System.out.println(ob1);
		
		//delete
		ob1.delete(5,7);
		System.out.println(ob1);
		
		//reverse
		ob1.reverse();
		System.out.println(ob1);

	}

}
