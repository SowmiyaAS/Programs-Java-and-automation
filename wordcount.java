package Table;

import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) {
		Scanner Obj=new Scanner(System.in); //scanner is a class.


		//Enter user name and press enter

		System.out.println("Enter username");

		String n=Obj.nextLine();

		String[] split=n.split(" ");		
		int count=0;

		for (int i = 0; i < split.length; i++)
		{
		
			count++;
		}
		System.out.println("username is:"+n);
		System.out.println("username length is"+" "+count);
	}}
