package proyecto;

import java.util.Random; // Random number generator

	public class Dice {
		
		private static Random generator = new Random(); // Random number generator
		
		/**
		 * Rolls a 6-sided dice: 1D6
		 * @return the result of rolling the dice
		 */
		public static int roll()
		{
			return roll(6); // By default there are 6 sides
		}
		
		/**
		 * Rolls a N-sided dice: 1DN
		 * @param number of sides
		 * @return the result of rolling the dice
		 */
		public static int roll(int sides) // It need the number of sides
		{
			return generator.nextInt(sides) + 1;
		}
		
		/**
		 * Test function to check that all sides have the same probability
		 */
		public static void testDice()
		{
			final int TRIES = 1000000;
			double totals[]={0,0,0,0,0,0};
			for(int x = 0; x < TRIES; x++)
				totals[roll()-1]++;
			for(int x = 0; x < 6; x++)
				System.out.printf("%d: %f\n", x, totals[x]/TRIES);
		}
	}
