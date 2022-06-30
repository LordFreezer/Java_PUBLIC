package pak;
import java.util.Scanner;
public class Roll {
	public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("       WEEKLY PAYROLL INFORMATION");
        System.out.println("       --------------------------");
        System.out.println("\n       Please enter the employer's name: ");
        String empName = input.next();
        System.out.println("\n       Please enter Social Security:");
        String empSocial = input.next();
        System.out.println("\n       Please enter the number of hours worked this week: ");
        double hrsWorked = (double)input.nextDouble();
        System.out.println("\n       Please enter employee's HOURLY PAY RATE: ");
        double payRate = (double)input.nextDouble();
        double grossPay = (hrsWorked * payRate);
        double federalTaxWithheld = (0.15 * grossPay);
        double socialSecurityWithheld = (0.05 * grossPay);
        double netPay = (federalTaxWithheld + socialSecurityWithheld - grossPay);
        System.out.println("\n\n      The weekly payroll information summary for: " + empName);
        System.out.println("\n  Social security number: " + empSocial);
        System.out.println("\n       Gross pay: " + grossPay);
        System.out.println("       Federal income taxes witheld:" + federalTaxWithheld);
        System.out.println("       Social Security taxes witheld: " + socialSecurityWithheld);
        System.out.println("       Net Pay: " + netPay);
       
    }

}
