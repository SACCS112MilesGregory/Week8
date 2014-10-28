
public class RandomNumber1 
{
	private static int GenerateRandomNumber;
	
	public static void GenerateRandomNumber(int randomPlay)
	{
		GenerateRandomNumber = randomPlay;
		randomPlay = 0 + (int)(Math.random() * 3);
	}
	
	public void setRandomNumber(int randomPlay)
	{
		GenerateRandomNumber = randomPlay;
	}
	
	public int getRandomNumber()
	{
		return GenerateRandomNumber;
	}
}
