import javax.swing.*;
import java.util.Scanner;

public class EvenOdd5
{
	public static void main(String[] args, int answer) 
	{
		int secretNumber;
		int number;
		String myGuess;
		
		Scanner input = new Scanner(System.in);

		JOptionPane.showMessageDialog(null, "Welcome To The Odd/Even Game!");
				
		do
		{
			secretNumber = (int)(Math.random() * 999 + 1);
			
			myGuess = JOptionPane.showInputDialog("Enter your guess: ");
			number=Integer.parseInt(myGuess);
			
			String message =
					String.format("Your guess is ", number);
			JOptionPane.showMessageDialog(null, message);

			if(secretNumber %2 == 0)
				JOptionPane.showMessageDialog(null, "The random number " + secretNumber + "is even");
			else
				JOptionPane.showMessageDialog(null, "The random number " + secretNumber + " is odd");
						
			JOptionPane.showInputDialog(null, "The computer chose: ", secretNumber);
			
			if(number %2 == 0 && secretNumber %2 == 1)
				JOptionPane.showMessageDialog(null,"Your number " +myGuess+ " is even and the Random Number " +secretNumber+ " is odd.");
			if(number %2 == 0 && secretNumber %2 == 0)
				JOptionPane.showMessageDialog(null,"Your number " +myGuess+ " is even and the Random Number " +secretNumber+ " is also even.");
			if(number %2 == 1 && secretNumber %2 == 0)
				JOptionPane.showMessageDialog(null,"Your number " +myGuess+ " is odd and the Random Number " +secretNumber+ " is even.");
			if(number %2 == 1 && secretNumber %2 == 1)
				JOptionPane.showMessageDialog(null,"Your number " +myGuess+ " is odd and the Random Number " +secretNumber+ " is also odd");
						
			JOptionPane.showInputDialog(null, "Would you like to play again? Please enter 1 for Yes or 2 for No: ", answer);
			answer = input.nextInt();
			
		}while (answer == 1);
	} // End class main()
} // End of class EvenOdd5
