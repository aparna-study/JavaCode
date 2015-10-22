/**
 * The programs asks user an integer number Limit and Count. It then generates exactly a Count number of integer random numbers from 1 to Limit.

 * Print the output numbers with 15 per line.

 * Print the largest, smallest random numbers at the end of the list.
 * @author : Aparna Kulkarni
 * 
 */
//package classwork;
import java.util.Scanner;
import java.util.Random;
public class RandomList84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readInput=new Scanner(System.in);
		Random genRand=new Random();
		int changeLineCnt=0; 
		int largestNum=0,smallestNum=1;
				
		System.out.println("Create random numbers");
		System.out.print("Enter the upper limit: ");
		int upperLimit=readInput.nextInt();
		
		System.out.print("\n");
		System.out.println("Enter the count of numbers: ");
		int count=readInput.nextInt();
		
		for(int i=1; i <= count ;i++)
		{
			int rand=genRand.nextInt(upperLimit)+1;   
		System.out.printf("%7d",rand);
		System.out.print(" ");
		changeLineCnt ++;
		if(changeLineCnt==15)
		{
			System.out.println("");
			changeLineCnt=0;
		}
		
		if(i==1){      //Initially it assigns value to min and max which is entered by user
    	       largestNum=rand;
    	       smallestNum=rand;
    	}
    	else{
    	         	  if(rand > largestNum){
    	            		  largestNum=rand;              //compares the value if larger than previous value it is assigned to max
    	            	  }
    	              if(rand < smallestNum){
    	            		  smallestNum=rand;             // in else part assigns min value
    	                 }
    	 }
    	         
		 
		}
		
		
		System.out.println("\nThe largest random number is: "+largestNum);
		System.out.println("The smallest random number is: "+smallestNum);

	}

}
