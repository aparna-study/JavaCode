/**
 * 
 * @author Aparna Kulkarni 84083
 * In this program the value of PI was approximated by calculating the series
 *
 */
import java.util.*;
public class PiEstimator84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rn=new Scanner(System.in);
		System.out.println("Enter a count N to estimate the value of PI by looping for a series calculation: ");
		int count=rn.nextInt();
		
		ArrayList<Double> pivalue=estimatePI(count);           // calling estimatePI method
		
		System.out.println("Estimate PI values are:");      // print arraylist values one per line
		for(int i=0;i<count;i++)
		{
		 System.out.printf("%2.14f\n",pivalue.get(i));
		}
		
		
		System.out.printf("\nThe PI constant in Java Math class is %2.14f" ,Math.PI);

	}
	/**
	 * *estimatePI method
	 * @param count user provides it to generate values , count times loop executed
	 * @return aaraylist which has all the approxomate values
	 */
	static ArrayList<Double> estimatePI(int count) {
		
		double sumAllTerms=0.0,element=0.0,value=0.0;
		int seriesVal=1;
		int s=1;
		
		ArrayList<Double> pivalue = new ArrayList<Double>();
		for(int i=0;i<count;i++)
		{      
			   if(i==0)
			   {
				   sumAllTerms=1;
		     	
			   }
			   else{
			    	seriesVal=seriesVal+2;
			   	   s=s*(-1);                                                  // for alternate + - sign multiply by -1
			   		element=s*((double)(1/(seriesVal*Math.pow(3,i))));
			   		sumAllTerms=sumAllTerms + element ;
			    	 
			   }
			   value=sumAllTerms*Math.sqrt(12);
			   pivalue.add(value);                                         // add values to arraylist
		}
		
		return pivalue;                                                  //return arraylist
	}

}
