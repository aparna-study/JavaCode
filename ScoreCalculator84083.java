/**
 * 
 * @author Aparna
 * This class accepts the count of scores from user, then actual scores and computes sum of scores,
 * minimum amongst all scores it's position, then total of all scores without minimum and finally it's average.
 * 
 */
import java.util.Scanner;
public class ScoreCalculator84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		
		Scanner arraySize= new Scanner(System.in);
		ScoreCalculator84083 scoreCalc=new ScoreCalculator84083();
		
		System.out.println("Enter the count of score");
		 count=arraySize.nextInt();
		 
		 double[] scores = scoreCalc.readInputs(count);
		 double total = scoreCalc.sum(scores) - scoreCalc.minimum(scores);
		 
		 System.out.printf("Final Score after removing minimum value: %.4f",total);

		 double average=(double) scoreCalc.sum(scores)/count;
		 
		System.out.println("\nAverage including minimum value: "+average);
		 double average2=(double) total/(count-1);

		 System.out.println("\nAverage without minimum value: "+average2);
	}
	/**
	 *
	 * @param count
	 * @return reference to array value accepted from user
	 */
    double[] readInputs(int count){
		
		Scanner arrayele= new Scanner(System.in);
		 double[] allScores=new double[count]; 
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter your next scores");
			allScores[i]=arrayele.nextDouble();
		}
		
		
		return allScores;
		
	}
    
    /**
     * 
     * @param scores
     * @return minimum score among all scores 
     */
    double minimum(double[] scores){
        double min=scores[0];
        int smallestpos=0;
        
        for(int i=1;i<scores.length;i++)
        {
        	if(min>scores[i])
        	{
        		min=scores[i];
        		smallestpos=i;
        	}
        }
        System.out.println("smallest element position in an array is: "+smallestpos);
        
    	return min;
    			
    }
    /**
     * 
     * @param scores
     * @return sum of all elements
     */
    double sum(double[] scores){
    	double sum=0;
    	
    	for(double element:scores)
    	{
    		sum=sum+element;
    	}
    return sum;
    }
	

}
