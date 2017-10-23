import java.util.Scanner;
public class diamondAsterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a side length: ");
		int length = in.nextInt();	 
		for(int i=1;i<=length;i++)
		{
			for(int j=1;j<=length-i;j++)      
	        	{
	            	System.out.print(" ");
	            } 
	        for(int j=1;j<=i*2-1;j++)                
	            {
	                System.out.print("*");
	            }
		 System.out.println();	    
	     }            
	    for(int i=length-1;i>0;i--)
	    {
	    	 for(int j=1;j<=length-i;j++)                
	         	{
	    		 	System.out.print(" ");
	            }
	         for(int j=1;j<=i*2-1;j++)                
	            {
	        	 	System.out.print("*");
	            }
		    System.out.println();
	    }  
	}

}
