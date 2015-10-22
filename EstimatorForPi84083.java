
/**
 
 * @author Aparna
 * In this program the value of PI was approximated by calculating the series

 */


public class EstimatorForPi84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("The PI value approximation is: %10.11f " ,estimatePI(21));
		
		System.out.printf("\nThe PI constant in Java Math class is %10.11f" ,Math.PI);
		 	}

	
	public static double estimatePI(int loopCount)
	{
		double sumAllTerms=0.0,piValue=0.0;
		int seriesVal=1;
		
		for(int i=0;i<loopCount;i++)
		{
			   if(i==0)
			   {
		     	sumAllTerms=1;
		     	
			   }
			   else{
			   if(i%2!=0)
			   {
				   seriesVal=seriesVal+2;
				   sumAllTerms=sumAllTerms-(double) 1/(seriesVal*Math.pow(3,i));
			   }
			   if(i%2==0)
			   { 
			   	   seriesVal=seriesVal+2;
				   sumAllTerms=sumAllTerms+(double) 1/(seriesVal*Math.pow(3,i));
			   }
			   }
		}
		
		piValue=sumAllTerms*Math.sqrt(12);
		return piValue;
	}
}
