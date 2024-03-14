package arrays;
import java.util.Scanner;
public class Print {
  public static void main(String[] args) {
	   int[] arr = new int[10];
	   Scanner Sn = new Scanner(System.in);
	   System.out.println("Classifying Odd and Even numbers");
	   System.out.println("Enter numbers ");
	   for(int i=0;i<10;i++) {
		    arr[i] = Sn.nextInt();
	   }
	   Sn.close();
	   System.out.println("The Entered Odd numbers are: ");
	   for(int j=0;j<arr.length;j++) {
		    if(arr[j] % 2 != 0) {
		    	System.out.print(arr[j]+"\t");
		    }}
		System.out.println("\n\nThe Entered Even numbers are: ");
	   for(int k=0;k<arr.length;k++)
		   if(arr[k] % 2 == 0) {
			    
		    System.out.print(arr[k]+"\t");
	   }
		    	
		    }
	   }

