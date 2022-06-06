package Javaecxe;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
//		int[] arr= {1,4,3,2,5,6,4,3,7};
//		List<Integer> array=new ArrayList<Integer>();
//		for (int i = 0; i <arr.length; i++) {
//			array.add(arr[i]);
//			}
//		Set<Integer> dup=new TreeSet<Integer>(array);
//		 System.out.println(dup);
//		
		
	int[] arr= {1,2,5,3,5,6,3,4,5};
	Set<Integer> dup=new TreeSet<Integer>();
	for (Integer integer : arr) {
		dup.add(integer);
	}
	System.out.println(dup);
		}}
	














//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if(arr[i]==arr[j])
//				{
//					System.out.println(arr[i]);
//				}
//				
//			}
//			
	//	}

	


