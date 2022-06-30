package pack;
import java.util.Scanner;
public class GratuityCalc {
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the subtotal...");
	double subTotal = input.nextDouble();

	System.out.println("Enter the gratuity rate as a percentege...");
	double gratuityRate = input.nextDouble();

	double Gratuity = (gratuityRate/100) * subTotal;
	double Total = subTotal + Gratuity;

	System.out.println("The gratuity is $" + Gratuity +" and the total is $" + Total);
	}
}
