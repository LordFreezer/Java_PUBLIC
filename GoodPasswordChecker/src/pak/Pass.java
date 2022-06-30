package pak;
import java.util.Scanner;
public class Pass {
	public static void main(String[] args) 
    {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Password... ");
	String Password = input.next();
            if(goodPassMethod(Password) == true)
            {
                System.out.println("Password Valid");                   
            }
            else
                System.out.println("Pasword Invalid");
}
public static boolean goodPassMethod(String passWord) 
    {
	final int MAX = 8;	
            final int MIN = 2;	
	boolean goodPass = goodLengthMethod(passWord, MAX) && noSpecialChar(passWord) && hasNumbers(passWord, MIN);
	return goodPass;
}
public static boolean goodLengthMethod(String password, int goodLength) 
    {
	return password.length() >= goodLength;
            ///return password.length() >= 8; 
}
public static boolean noSpecialChar(String passWord) 
    {
	for (int i = 0; i < passWord.length(); i++) 
            {
		if (!Character.isLetterOrDigit(passWord.charAt(i))) 
                    {
			return false;
		}
                    
	}
	return true;
}
public static boolean hasNumbers(String passWord, int Number) 
    {
	int num = 0;
	for (int i = 0; i < passWord.length(); i++) 
            {
		if (Character.isDigit(passWord.charAt(i))) 
                    {
			///num++;
                            ++num;
		}
		if (num >= Number) 
                    {
                        return true;
                    }
                    
                   /*f(num <= Number)
                    {
                        return false;
                    }
                    else
                    {
                        return true;
                    }*/
                    
	}
	return false;
}


}
