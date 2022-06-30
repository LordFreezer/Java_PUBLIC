package pak;
import java.util.Scanner;
public class Minimum {
	public static void main(String[] args) 
    {
            int x = 0;
	Scanner input = new Scanner(System.in); 
	double[] num = new double[10]; 
            do{
	System.out.print("Enter ten numbers... ");  
            
	for (int i = 0; i < num.length; i++) 
            {          
                if(input.hasNextInt()||input.hasNextDouble())
                {
                    num[i] = input.nextDouble();
                }
                else
                {                     
                
                    System.out.println("NOT A NUMBER!!! I would reset if i could, but ill just terminate here");
                    System.exit(0);
                    
                }    
                
	}
            }while(x!=0);
	System.out.println("The min is " + min(num));

}
public static double min(double[] arrMin) 
    {
	double min = arrMin[0];	
	for (double i: arrMin) 
            {
		if (i < min)
			min = i;
	}
	return min;
}

}
