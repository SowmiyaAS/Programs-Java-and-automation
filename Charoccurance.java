package String;

public class Charoccurance {

	public static void main(String[] args) {
		String name="welcome chennai";
		// count char 'a' letter
		
		char find='e';
		int count=0;
		   for (int i = 0; i <name.length(); i++) 
		   {
			  if(find==name.charAt(i))
			  {
			  count++; 
			  }
		   }
			    System.out.println(count);
			    
		}
		}
	
		


