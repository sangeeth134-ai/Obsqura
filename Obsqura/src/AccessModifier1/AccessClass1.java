package AccessModifier1;

public class AccessClass1 {

	public String a = "public";
	private String b = "private";
	protected String c = "protected";
	String d = "default";
	
	public static void main(String[] args) {

		AccessClass1 ob = new AccessClass1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}

}
