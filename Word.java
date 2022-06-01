package Table;

public class Word {
	
	public static void main(String[] args) {
		String str="All for One and one for all";
				
				String name=str.toLowerCase();
				System.out.println(name);
				
				String[] str1=name.split(" ");
				
				for (int i = 0; i <str1.length; i++) {
					int count=1;
		
					for (int j = i+1; j <str1.length; j++) {
		
						if (str1[i].equals(str1[j])) {
		                       count++;
						}
					}
		            if (count>1) 
		            System.out.println(str1[i]);
		            }
}}
	









