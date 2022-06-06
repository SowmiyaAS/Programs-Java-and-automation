package Javapractice;

import java.util.Arrays;

public class Missingele {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,5,8};
		
		for (int i = 0; i< arr.length; i++)
		{
			Arrays.sort(arr);
	       
		
	       if(i+1!=arr[i])
	      {                      
		System.out.println("Missing element"+" "+(i+1));
		break;
	 	
	}
		
	  }
	}
	
	
	
	

}
