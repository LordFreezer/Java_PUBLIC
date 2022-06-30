package pak;
import java.util.Scanner;
public class Votes {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
                int x = 0;
		int voteYes = 0;
		int voteNo = 0;
                boolean isValad = true;
                do
                {
                    do{
                    isValad = true;
                    {
			System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting and display the results");
			String vote = input.next();
			switch(vote)
			{
                        case "Y":
                        case "y":
				voteYes = voteYes + 1;
				break;
			case "N":
			case "n":
				voteNo = voteNo + 1;
				break;
			case "Q":
			case "q":
                                x = 10;
                                System.out.println("The number of 'yes' votes are " + voteYes + " and the number of 'no' votes are " + voteNo);
                            
				break;
			default:
				System.out.print("INVALID CODE:");
                                
                                break;
                        }
                    }
                    }while(!isValad);			
                }while(x < 1);
        }

}
