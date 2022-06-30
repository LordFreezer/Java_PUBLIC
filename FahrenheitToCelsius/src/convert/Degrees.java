package convert;
import java.util.Scanner;
public class Degrees {
	public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in Celsius...");
    double celsuis = input.nextDouble();
    double fahrenheit = (9.0/5) * celsuis + 32;
    System.out.println(" The temp is " + fahrenheit +" degrees");   

    }

}
