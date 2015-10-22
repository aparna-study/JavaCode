//package scorecal;
import java.util.Scanner;

public class ScoreCal {

public static void main(String[] args) {
// TODO Auto-generated method stub

int count=1;

Scanner arraySize= new Scanner(System.in);
ScoreCal scoreCalc=new ScoreCal();

System.out.println("Enter the count of score");
count=arraySize.nextInt();

double[] scores = scoreCalc.readInputs(count);
double total = scoreCalc.sum(scores) - scoreCalc.minimum(scores);
System.out.println("Final Score: "+total);
double average=(double) scoreCalc.sum(scores)/count;

System.out.println("Average including minimum value: "+average);

}

double[] readInputs(int count){

Scanner arrayele= new Scanner(System.in);
double[] allScores=new double[count];
for(int i=0;i<count;i++)
{
System.out.println("Enter your next scores");
allScores[i]=arrayele.nextDouble();
}
System.out.println("You have entered ");

return allScores;

}

double minimum(double[] scores){
double min=scores[0];
int smallestpos=0;

for(int i=1;i<scores.length;i++)
{
if(min<scores[i])
{
min=scores[i];
smallestpos=i;
}
}

return min;
}

double sum(double[] scores){
double sum=0;

for(double element:scores)
{
sum=sum+element;
}
return sum;
}


}