import java.util.Scanner;
import java.lang.Math;

/** This is javadoc documentation.
 * @author Aparna Kularni (84083)
 * @param Double
 * This program accepts the values for major and minor ellipse axis from user and
 * Calculate and prints results of area , focus and circumference of the ellipse
 */

public class Ellipse84083 {

	public static void main(String[] args) {
		
		Scanner readInput = new Scanner(System.in);
		
		System.out.println("This program calculates the focus, area, and circumference of an ellipse");
		System.out.println("The semi-major axis number must be larger than the semi-minor axis number \n");
		
		System.out.println("PLease enter value for semi major radius of ellipse.");
		Double a = Double.parseDouble(readInput.nextLine());
				
		System.out.println("PLease enter value for semi minor radius of ellipse ");
		Double b = Double.parseDouble(readInput.nextLine());
		
		while(b>a)
		{
			System.out.println("Semi minor axis should be small or equal to semi major axis.");
			System.out.println("Please enter value smaller or eqaual to semi major axis: ");
			b = Double.parseDouble(readInput.nextLine());
		}
		
		
		Double f=Math.sqrt(a*a - b*b);
		System.out.printf("Focus is: %.2f \n",f);	
		
		Double area=Math.PI*a*b;
		System.out.printf("Area is: %.2f \n",area);
		
		Double circumference=Math.PI*(3*(a+b)-Math.sqrt((10*a*b)+3*(Math.pow(a, 2)+Math.pow(b, 2))));
		System.out.printf("Circumference is: %.2f \n",circumference);	
		
		readInput.close();
	}

}
