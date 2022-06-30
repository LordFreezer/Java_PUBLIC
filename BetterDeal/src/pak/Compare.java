package pak;
import java.util.Scanner;
public class Compare {
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("How much did bag 1 weigh?.");
	double weight1 = input.nextDouble();
	System.out.println("How much did bag 1 cost?..");
	double cost1 = input.nextDouble();
	System.out.println("How much did bag 2 weigh?...");
	double weight2 = input.nextDouble();
	System.out.println("How much did bag 2 cost?....");
	double cost2 = input.nextDouble();
	if (cost1 / weight1 < cost2 / weight2)
		System.out.println("Bag 1 has the better value.");
	else if (cost1 / weight1 > cost2 / weight2)
		System.out.println("Bag 2 has the better value.");
	else
		System.out.println("Both bags have the same price.");
	}
}
