package Javapractice;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=157;
		int rem;
		int result=0;
for (int i = 1; i<=num; i++) {
			
			rem=num%10;
			result=result+(rem*rem*rem);
			num=num/10;

		//System.out.println("1 to 1000 Armstrong numbers"+" "+result);
}
if(num==result)
{
	System.out.println("Armstrong num");
}

else
	
{
	System.out.println("not a armstrong number");
}
	}

}
