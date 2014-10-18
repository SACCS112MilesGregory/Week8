import javax.swing.JOptionPane; // program uses JOptionPane
import java.util.Scanner;
import java.util.Random;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int number;
		
		String secretNumber;
		
		secretNumber = JOptionPane.showInputDialog( null, " Enter a number" );
		number = Integer.parseInt(secretNumber);
		if ( number % 2 == 0 )
		{
			System.out.print( "Number is EVEN" );
		}
		System.out.print("Number is ODD");
	}
}