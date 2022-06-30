import java.util.Scanner;

public class p4ChadMarshall 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first bidder's name?...");		
		String bidderName1 = input.next();
		System.out.println("What is the second bidder's name?...");
		String bidderName2 = input.next();
		System.out.println("How much does the first bidder charge per hour? In dollars....");
		double bidderHourlyrate1 = input.nextDouble();
		System.out.println("How Much does the second bidder charge per hour? in dollars...");
		double bidderHourlyrate2 = input.nextDouble();
		System.out.println("How many hours did the first bidder work?....");
		double bidderHours1 = input.nextDouble();
		System.out.println("How many hours did the second bidder work?...");
		double bidderHours2 = input.nextDouble();
		double total1 = bidderHours1 * bidderHourlyrate1;
		double total2 = bidderHours2 * bidderHourlyrate2;
		if(total1 < total2)
			System.out.println("The winner is "+ bidderName1 +" and the cost is "+ total1);
		else if(total1 == total2)
			{
			if(bidderHours1 < bidderHours2)
				System.out.println("The winner is "+ bidderName1 +" and the cost is "+ total1);
			else if(bidderHours1 == bidderHours2)
 				System.out.println("The bidders are "+bidderName1+"and "+bidderName2+". The number of hours are "+bidderHours1+"and "+bidderHours2+ "respectively. The cost per hour is "+ bidderHourlyrate1 +" and "+bidderHourlyrate2 + "respectively.");
			else 
				System.out.println("The winner is "+ bidderName2 +" and the cost is "+ total2);
			}
		else
			System.out.println("The winner is "+ bidderName2 +" and the cost is "+ total2);
			
	}
}

