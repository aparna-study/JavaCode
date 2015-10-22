/**
 * @author Aparna Kulkarni
 * Java program implements a simple number guessing game with multiple questions / answers
 * For each game, the program generates a random number between 1 and 10. User enters an answer from 1 and 10.
 * If the user input number matches the generated number, then print a message to inform users that he/she has a correct guess
 * keeps track of the wins and losses and print the counts when user chooses to exit by entering 
 */
import java.util.*;


public class Game84083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int trynum=0,guess=1,win=0,loose=0,game=0,flag=0;
		ArrayList trialarray=new ArrayList<>();
		ArrayList secretarray=new ArrayList<>();
		
		boolean correct=false;
		System.out.println("“Welcome to the number guessing game");
		System.out.println("For each game, you have at most 3 chances to guess a secret number from 1 to 10.”");
		
		Random rn=new Random();
				
		while(flag==0){                           //outer loop will run until flag is not =0 and flag changes when user enter -1
			int secretnum=rn.nextInt(10)+1;       // generating random number
			secretarray.add(secretnum);      	  //  adding secret number to arraylist
			System.out.println("\nEnter a number from 1 to 10. Enter -1 to exit");
			while(correct==false && trynum<3)     // inner loop will run until user try guess for 3 times or when the guess is not correct
			{
				guess=scn.nextInt();
			
				if(guess==-1){
					flag=1;                             //when user types -1 control come out of inner loop
					break;
				  }
				else{
					if(secretnum==guess){
					    System.out.println("Congratulation, correct! Let’s start a new game");
					    correct=true;
					    trynum++;                     //increment how much time user tried for guess
					    win++;                        //increment win variable as user guessed number correct
					    break;
				 }
				if(trynum>2){ break;}
				else{
					  System.out.println("Not correct, try again:");      // break the loop for 3rd wrong try 
					  trynum++;
				    }
			    }
		   }
			trialarray.add(trynum);
		    
		    if(flag==1){ 
		    	 if(trynum>0){loose++;}       // break from outer loop if user has already input -1 also check boundary condition for loose
		    	 break; 
		   	}     
		    if (correct==false){
				System.out.println("\nNot correct. You have reached your third trial. The correct number is "+secretnum);
				System.out.println("Lets start a new game");
				loose++;
			 }
		    	trynum=0;                  // again it should be set to zero to start new game and outer loop
		    	correct=false;
		 }
		
		game=win+loose;
		System.out.println("\nTotal games: "+game);
		System.out.println("Total wins:  "+win);
		System.out.println("Total losses: "+loose);
		    
		System.out.println("\nGame  Secret Trials");
		for(int i=0;i<game;i++){
			System.out.printf("%4d %4d %4d\n",i+1,secretarray.get(i),trialarray.get(i));
			
		}  
		

		
	}

}
