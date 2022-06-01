package Table;

public class Stringcmp {
	static String c;
	 public static String strCompare(String a,String b)  {
		 if(a.equals(b))
			 {
				 System.out.println("equal");
			 }
		 else
		 {
			 System.out.println("not equal");
		 }
		 if(a.equals(b))
		 {
			 c=a+b;
			 System.out.println(c);
		 }
		 
		return b;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
strCompare("hello","hello");
	}

}
