package Javapractice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		 int f=0;
		 int s=1;
		 int sum;
		 System.out.println(f);
		 System.out.println(s);
 
			  for (int i = 0; i <=n; i++) {
			  sum=f+s;
			  f=s;
			  s=sum;
			  System.out.println(sum);
		 
		  }
	
}
}