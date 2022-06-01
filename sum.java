package Practice;

public class sum {

	public static void main(String[] args) {
	int n=100;
	int temp;
	int sum=0;
	
	while(0<n)
	{
		temp=n%10;
		sum=sum+temp;
		n=n/10;
		//System.out.println(n);
	 
	}
	System.out.println(sum);
//System.out.println(n);
	}

}
