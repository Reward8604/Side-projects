package com.ransomward.magic8ball;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

	
	
	
	
	
	public class magic8Ball 
	{
		private static Scanner scanner = new Scanner(System.in);
	
		ArrayList<String> goodResponse = new ArrayList<String> (Arrays.asList("It is a definite yes", " It is affirmative", "The possibility points to yes", "Of course", "By all means"
				  																	, "Certainly", "Sure", "It may very well occur", "Absolutely", "Indubitably"));

		ArrayList<String> badResponse = new ArrayList<String> (Arrays.asList("Ixnay", "I wouldn't bet on it", "The possibility point to no", "Under no circumstances", "Never"));

		 
		ArrayList<String> vagueResponse = new ArrayList<String> (Arrays.asList("Give me time to think on that, ask later", "It is not wise to give an immediate answer", "Prediction null at the moment"
				  																	, "I haven't an idea right now", "Ask again?"));

		  
		  public int randomNumber()
		  {
		    Random rand = new Random();
		    int randomRoll = rand.nextInt(20);
		    return randomRoll;
		  }
		  
		  
		  
		  public static void main(String[] args)
		  {
			   String goAgain = "Y";
			   String response;
			  
			   
			  while(goAgain.equalsIgnoreCase("y") )
			  { 
			  printGreeting();
			  
			  response = scanner.nextLine();
			 
			  magic8Ball roll = new magic8Ball();
		    
			  ArrayList<String> predict = new ArrayList<String>();
		    
			  predict.addAll(roll.goodResponse);
		    
			  predict.addAll(roll.badResponse);
		    
			  predict.addAll(roll.vagueResponse);

			  int prediction = roll.randomNumber();
			
			  
			  System.out.println( "Give me a moment to work my magic...\n" + predict.get(prediction));
			  System.out.println();
			
			  System.out.println("Please run program again for a prediction to your next question!!!!");
			  System.out.println();
			  System.out.println();
			  
			  
			  System.out.println("\nWould you like to ask another question? (Y/N)");
	            goAgain = scanner.nextLine();
	         
			  }
		  }
		
		  private static void printGreeting()
		  {
			  System.out.println("Welcome to the magic8Ball, Please ask me a question?!?!");
			  System.out.println(); 
		  }
	}
