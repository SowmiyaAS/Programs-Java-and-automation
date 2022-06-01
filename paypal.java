package Table;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class paypal {

	public static void main(String[] args) {
		String str="paypal india";
		String empty="";
		
		String rep=str.replace(" ", "");
		
		System.out.println("After replace"+" "+rep);
		
		char[] charArray=rep.toCharArray();
		
		Set<Character> dup=new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			dup.add(charArray[i]);
			}
		
		List<Character> array=new ArrayList<Character>(dup);
		
		System.out.println(array);
		
		for (int i = 0; i <array.size(); i++) {
			
			empty=empty+array.get(i);
		}
		System.out.println(empty);
		}

}
