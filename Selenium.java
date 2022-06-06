package Javaecxe;

import java.util.Scanner;

public class Selenium {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the Text");

	String text=sc.nextLine();
	
	String[] split=text.split(" ");
	
	int count=0;
	for (int i = 0; i < split.length; i++) {
		
		count++;
	}
		System.out.println("The words count is:"+" "+count);
	
	}

}
