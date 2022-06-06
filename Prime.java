package Javapractice;


public class Prime {

	public static void main(String[] args) 
	{
		int n=97;
		int count=0;
		for (int i = 1; i <=97; i++) {
			if(n%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("97 number is prime");
			}
			else
			{
				System.out.println("97 number is not prime");
			}
		}
		
	}

