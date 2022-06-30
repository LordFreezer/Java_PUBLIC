package program2;
import java.util.Scanner;

public class Program2 
{

   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

	System.out.println("How much was the food?");
	double food = input.nextDouble();

	System.out.println("How much was the drink?");
	double drink = input.nextDouble();

	System.out.println("How much was the desert?");
	double desert = input.nextDouble();

	double meal = food + drink + desert;	
	double mealTax = meal * .10;
	double mealTip = meal * .15;
	double costTotal = meal + mealTax + mealTip;

	System.out.println("The meal is $" + meal + ". The tip is $" + mealTip
	 + ". The tax is $" + mealTax); 
	System.out.println("The total cost is $" + costTotal);
    }
    
}
