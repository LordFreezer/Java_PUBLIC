package pak;
import java.util.Scanner;
public class Major {
	public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" 'm' = 'mathmatics' ");
        System.out.println(" 'i' = 'information technology' ");
        System.out.println(" 'c' = 'computer science' ");
        String[] major = {"m","c","i"};
        String[] status = {"1","2","3","4"};
        System.out.println("What is your major?...");
        String outputMajor = input.next();
        for (int k = 2; k < major.length; k++) 
        {
            if(outputMajor == null ? major[0] == null : outputMajor.equals(major[0]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is mathmatics and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is mathmatics and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is mathmatics and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is mathmatics and you are an old fart");
                        }
                        
                    }
            }
            else if(outputMajor.equals(major[1]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is computer science and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is computer science and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is computer science and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is computer science and you are an old fart");
                        }
                        
                    }
            }
            else if(outputMajor.equals(major[2]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is information technology and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is information technology and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is information technology and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is information technology and you are an old fart");
                        }
                        
                    }
            }
        }            
    }
}
