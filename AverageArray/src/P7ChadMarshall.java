import java.util.Scanner;
import java.util.Arrays;
public class P7ChadMarshall 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        System.out.println("how many numbers should the array be?..");
        int num = input.nextInt();
        double[] array1 = new double[num];
        ArrayFiller(array1);
        Averagearray(array1);
        double avg = Averagearray(array1);
        System.out.println("the average is "+avg);
        System.out.println("the contents of the array are "+Arrays.toString(array1));
 
    }
    public static void ArrayFiller(double[] num)
    {   
        System.out.println("Enter the numbers you wish to use");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = input.nextDouble();
        }
    }
   public static double Averagearray(double[] arrayAvg)
    {
        double sum = 0;
        for(double i : arrayAvg)
        {
            sum += i;
        }
        double average = sum / arrayAvg.length;
        
        return (double)average;
    }
    
}
