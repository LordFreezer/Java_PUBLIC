package pak;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a string... ");
			String string = input.nextLine();
			///String string = input.next();
			String reverse = "";
			for (int k = string.length() - 1; k >= 0; k--) 
			{
				reverse += string.charAt(k);
			}
			System.out.println("The reversed string reads: " + reverse);
		}
}
