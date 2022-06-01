package Table;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
	//String str="testleaf";
	String s1="";
		//give a input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String s=sc.nextLine();
		
	for (int i = s.length()-1; i >=0; i--) {
		
	//System.out.println(s.charAt(i));
	s1=s1+s.charAt(i);
		
		System.out.println(s1);
	}}}
