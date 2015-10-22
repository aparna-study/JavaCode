/**
 * compares user input numbers and find the largest and smallest value and the average value.
*/
import java.util.Scanner;
public class LargestAndSmallest84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=1,min=0,max=0,sum=0,counter=0;
		int a[]=new int[20];
		Scanner readinput=new Scanner(System.in);
System.out.println("This program calculates the smallest, largest, and average value");
System.out.println("Enter -1 to stop");

    while(flag==1)
       {
    	int b=readinput.nextInt();
    	   if(b==-1){    	
    		   break;      	
    	   }
    	   else {
    		    if(b<-1)
    		     {
    			  System.out.println("Input number can not be less than -1. Try again.");
    		      }
    	         }
    	         if(b>=0 ) {
    	              if(counter==0){      //Initially it assigns value to min and max which is entered by user
    	            	  max=b;
    	            	  min=b;
    	              }
    	              else{
    	            	  if(b>max){
    	            		  max=b;              //compares the value if larger than previous value it is assigned to max
    	            	  }
    	            	  if(b<min){
    	            		  min=b;             // in else part assigns min value
    	            	  }
    	              }
    	         }
    	   sum=sum+b;
    	   counter++;
       }
	double average=(double)sum/counter;   // calculates average
    System.out.println("The largest value is "+max);
    System.out.println("The smallest value is "+min);
    System.out.println("The average value is "+average);
	}

}
