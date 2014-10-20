import javax.swing.JOptionPane;

import java.util.Scanner;

public class EvenOdd6
{
	public static void main(String[] args) 
	{
		int secretNumber;
		int number;
		String answer = null;
		int answer1;
		int wins = 0;
		int losses = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome To The Odd/Even Game!");
		
		do
		{
			secretNumber = (int)(Math.random() * 999 + 1);
			
			// prompt user to enter name
			String myGuess =
					JOptionPane.showInputDialog("Enter your guess: ");
			
			// create the message
			String message =
					String.format("Your guess is ", myGuess);
			
			// display the message
			JOptionPane.showMessageDialog(null, message);

			// convert the user's guess to an integer
			number=Integer.parseInt(myGuess);

			// test whether the random number is odd or even			
			if(secretNumber %2 == 0)
				JOptionPane.showMessageDialog(null, "The random number " + secretNumber + " is even");
			else
				JOptionPane.showMessageDialog(null, "The random number " + secretNumber + " is odd");
						
			// Win or Lose and count the number of wins and losses
			if(number == secretNumber)
			{
				JOptionPane.showMessageDialog(null, "You win!");
				wins++;
			}
			else
				JOptionPane.showMessageDialog(null, "You lose!");
				losses++;
			
			// check to see if the user wants to continue
			answer = JOptionPane.showInputDialog(null, "Would you like to play again? Please enter 1 for Yes or 2 for No: ");
			answer1=Integer.parseInt(answer);
		}while (answer1 == 1);
		
		JOptionPane.showMessageDialog(null, "The number of wins was " + wins + " and the number of losses was " + losses);
	} // end class main()
}// End of class EvenOdd5
