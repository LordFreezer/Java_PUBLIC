package pak;
import java.util.Scanner;
public class Substr {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the first string: ");
		String s1 = input.next();
		System.out.print("Enter the second string: ");
		String s2 = input.next();
		System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not ") +"a substring of " + s1);			
	}

}
