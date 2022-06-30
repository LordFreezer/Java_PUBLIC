package pak;
import java.util.Scanner;
public class Coin {
	public static void main(String[] args)
	{
	int Result;

	Result = (int)(Math.random() * 2); //Something different from c#
	Scanner input = new Scanner(System.in);
	System.out.println("Heads or Tails??? 1 for heads, 0 for tails");
	int userGuess = input.nextInt();
	if (userGuess == Result)
		{
		System.out.println("Bingo!");
		}
		else
		{
		System.out.println("GET BETTER AT GUESSING M8");
		}
	}

}
