package calc;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a raduis of a cylinder...");
     double radius = input.nextDouble();
  
     System.out.println("Enter a length of a cylinder...");
     double length = input.nextDouble();
     double area = radius * radius * 3.14;
     double volume = area * length; 
     System.out.println("The area is "+ area +". The volume is " + volume);  
}
}
