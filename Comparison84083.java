import java.util.Scanner;
public class Comparison84083 {

	public static void main(String[] args) {
		
		Scanner readInput=new Scanner(System.in);
		System.out.println("We will compare two strings and print it");
		
	
		System.out.println("Enter string 1");
		String s1=readInput.nextLine();
		
		System.out.println("Enter string 2");
		String s2=readInput.nextLine();
		char c1;
	
		
		System.out.println("The strings in ascending order");
	   int compare=s1.compareTo(s2);
//	
	  
	  //System.out.println(compare);
	   if(compare>0)
	   {
		   System.out.println(s2);
		   System.out.println(s1);
	   }
	   
	   if(compare<0)
	   {
		   System.out.println(s1);
		   System.out.println(s2);
	   }
	   
	   if(compare==0)
	   {
		   System.out.println("Both strings are equal");
		   System.out.println(s1);
		   System.out.println(s2);
	   }
	 
	}

}
