import java.util.Random;

public class RandomNumber 
{
	private static int randomPlay;
	
	public int GetANumber(int lo, int hi)
	{
		Random number = new Random();
		randomPlay = number.nextInt((3 - 1) + 1) + 1;
		
		return randomPlay;	
	}
}
