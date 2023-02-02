package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble(); 
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble(); 
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble(); 
		System.out.println("How many days are you playing? ");
		int totalSimulations = in.nextInt();
		int numberOfPlays = 0;
		int totalLosses = 0;
		for(int days = 0; days < totalSimulations; days++)
		{
			double currentAmount = startAmount;
			numberOfPlays = 0;
			while (currentAmount < winLimit && 0 < currentAmount)
			{
				if (Math.random() >= winChance)
				{
					currentAmount++;
					numberOfPlays++;
					//System.out.println("win!");
				}
				else 
				{
					currentAmount--;
					numberOfPlays++;

					//System.out.println("Lose :(");
				}

			}
			if  (currentAmount == winLimit)
			{
				System.out.println("Success!");
				;
			}
			if (currentAmount == 0)
			{
				System.out.println("Ruin!");
				totalLosses++;
			}
			System.out.println("We played " + numberOfPlays);
			System.out.println("Losses: " + totalLosses);
			if (winChance == .5)
			{
				System.out.println("Expected ruin rate: " + (1 - (startAmount/winLimit)));
			}
			else 
			{
				System.out.println("Expected ruin rate: " + (((1- winChance)/winChance)^(startAmount)-((1- winChance)/winChance)Math.po(winLimit))/(1-((1- winChance)/winChance)^(winLimit));
			}
			;
		}}
}