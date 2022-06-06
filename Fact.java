package Javapractice;

public class Fact {

	public static void main(String[] args) {
		
		int n=8;
		int fact=1;
		//8! print reverse 8*7*6*5*4*3*2*1=56*30*24=40320
		for (int i = n; i>=1; i--) {
			fact=fact*i;
		}
	System.out.println("fact is"+" "+ fact);
		}

}
