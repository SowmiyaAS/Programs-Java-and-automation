package Overrideclassroom;

public class Axisbank extends Bank{
	public void deposit()
	{
		System.out.println("12000 deposit in my account");
	}
	

	public static void main(String[] args) {
		Axisbank bnk1=new Axisbank();
		//Bank bnk=new Bank();
		bnk1.deposit();
		bnk1.saving();
		bnk1.fixed();
		

	}

}
