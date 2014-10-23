import javax.swing.JOptionPane; // program uses JOptionPane
import java.util.Scanner;

public class EvenOdd4
{
	public static void main(String[] args) 
	{
		int number;
		int answer;
		String secretNumber;
		Scanner input = new Scanner(System.in);
		
		do
		{
			secretNumber = JOptionPane.showInputDialog( null, " Enter a number" );
			number = Integer.parseInt(secretNumber);
			if ( number % 2 == 0 )
			{
				System.out.print( "Number is EVEN\n" );
			}
			else if(number % 2 == 1)
			{
				System.out.print("Number is ODD\n");
			}
			System.out.print("Would you like to play again? Please enter 1 for Yes or 2 for No: ");
			answer = input.nextInt();
		}while (answer == 1);
	} 
}
