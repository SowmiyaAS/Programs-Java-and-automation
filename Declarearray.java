package Array;

public class Declarearray {

	public static void main(String[] args) {
		//declare array
		//array length 20
		//index value 19
		//index value starting 0
		//int[] a= {1,2,3,4,5};
		int n=100;
	   int sum=0;
         for (int i = 1; i<=n; i++) {
			
			//System.out.println(i);   //op  = 1 2  3 4 5 
			
		
		         sum=sum+i; 
		         /* sum=0+1=1,
		          * sum=1+2=3,
		          * sum=3+3=6
		          * sum=6+4=10
		          * sum=10+5=15
		          * sum=15;
		          */
         }
		       System.out.println(sum);
		     }
		
		//for (int i= array.length-1 ; i>=0; i--) print reverse array


	}


