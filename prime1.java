package Javapractice;

public class prime1 {

	public static void main(String[] args) {
		// print 1 to 50 prime numbers
		int n=50;
		for (int i = 1; i<=n; i++) {
			
			int count =0;
			for (int j = 1; j<=i; j++) {
				
				if(i%j==0)
					count++;
			}
				if(count==2)
				
				{
			System.out.println(i);
		}
		}
			}
}