/**
 * 
 * Jonathan Kerns
 * Period 1
 *
 */

import java.util.Scanner;
import java.util.Random;

public class DiceRoll 
{

	public static void main (String []args)
	{
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many times would you like to roll? ");
		int num = keyboard.nextInt();
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		for(int counter = 0; counter != num; counter++)
		{
			int roll = rand.nextInt(6) + 1;
			System.out.println("You rolled a " + roll);
			
			if (roll == 1)
			{
				one++;
			}
			else if (roll == 2)
			{
				two++;
			}
			else if (roll == 3)
			{
				three++;
			}
			else if (roll == 4)
			{
				four++;
			}
			else if (roll == 5)
			{
				five++;
			}
			else if (roll == 6)
			{
				six++;
			}
			
		}
		System.out.println("\n\nIn total, you rolled:");
		System.out.println(one + " ones,");
		System.out.println(two + " twos,");
		System.out.println(three + " threes,");
		System.out.println(four + " fours,");
		System.out.println(five + " fives,");
		System.out.println("and " + six + " sixes");
		
		
	}
}
