package Myownpgm;

public class MethodOverloading {
	//same method name but different number of  arguments or different type of arguments

	public void art(String name,int age)
	
	{
	    System.out.println(name);
	    System.out.println(age);
	    
	}
	public void art(int num,String street)
	{
		System.out.println(num);
		System.out.println(street);

	}
	
	public void art(String village,float doorno)
	{
		System.out.println(village);
		System.err.println(doorno);
	}
	
	public static void main(String[] args) {
		//create object
		MethodOverloading load=new MethodOverloading();
		
		//method calling
		load.art("sowmi", 23);
		load.art("Andakottai", 22/7);
		load.art(58,"amman street");
		
		
		// TODO Auto-generated method stub

	}

}
