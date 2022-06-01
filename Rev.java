package Table;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String str=sc.nextLine();
		
		String s=" ";
		for (int i =str.length()-1; i>=0; i--) {
			
			s=s+str.charAt(i);
			System.out.println(s);
		}
		
		String[] s1=s.split(" ");
		int count=0;
		
		for (int i = 0; i <s1.length; i++) {
			count++;
		}
			System.out.println(count);
		}
		}


