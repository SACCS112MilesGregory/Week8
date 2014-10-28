import javax.swing.JOptionPane;

public class Week8Lab4
{
	public static void main(String[] args) 
	{
		String computerPlay = null;
		int count=0;
		
		JOptionPane.showMessageDialog(null, "It's the Rock, Paper, Scissors game!");
		RandomNumber1 randomPlay = new RandomNumber1();
		do
		{			
			// Setup up play by computer		
			if(randomPlay.getRandomNumber() == 1)
				computerPlay = "ROCK";
			else if(randomPlay.getRandomNumber() == 2)
				computerPlay = "PAPER";
			else if(randomPlay.getRandomNumber() == 3)
				computerPlay  = "SCISSORS";
			
			// Prompt user to enter Rock, Paper, or Scissors			
			String myPlay =
					JOptionPane.showInputDialog("Plesase enter Rock, Paper, or Scissors").toUpperCase();
			
			String message =
					String.format("Your play is %s", myPlay);
			
			JOptionPane.showMessageDialog(null, message);
			
			String message1 =
					String.format("The computer chose %s", computerPlay);
		
			JOptionPane.showMessageDialog(null, message1);
		
			// check the logic
			if(myPlay == "ROCK")
			{
				if(computerPlay == "PAPER")
				JOptionPane.showMessageDialog(null, "Paper covers rock. You lose!");
				else if(computerPlay == "SCISSORS")
					JOptionPane.showMessageDialog(null, "Rock crushes scissors. You win!");
				else if(computerPlay == "ROCK")
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			if(myPlay == "SCISSORS")
			{
				if(computerPlay == "PAPER")
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You win!");
				else if(computerPlay == "ROCK")
					JOptionPane.showMessageDialog(null, "Rock crushes scissors. You lose!");
				else if(computerPlay == "SCISSORS")
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			if(myPlay == "PAPER")
			{
				if(computerPlay == "ROCK")
					JOptionPane.showMessageDialog(null, "Paper covers rock. You win!");
				else if(computerPlay == "SCISSORS")
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You lose!");
				else if(computerPlay == "PAPER")
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			count++;
		} while(count<3);
	}
}
