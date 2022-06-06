package Myownpgm;

public class Constructoroverloading {

	
String collegename;
	String name;
	int num;
	
	
	// default constructor
	Constructoroverloading()
	{
	System.out.println("default constructor ");

	}
	
	//parameterized constructor
	Constructoroverloading(String name,int num)
	{
		System.out.println(name);
		System.out.println(num);
		System.out.println("parameterized constructor");
	}
	Constructoroverloading(String name)
	{
		
        this();
     collegename=name;
	}

	
	
	
	public static void main(String[] args) {
		
		//Constructoroverloading load=new Constructoroverloading();
	  
		Constructoroverloading load1=new Constructoroverloading("sowmi ",7);
		
		Constructoroverloading load2=new Constructoroverloading("Anna University");
		System.out.println(load2.collegename);
	
		
	
	}
	
	
	

}
