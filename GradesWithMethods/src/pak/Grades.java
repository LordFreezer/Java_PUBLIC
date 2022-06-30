package pak;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) 
    {
	Scanner input = new Scanner(System.in);
	System.out.print("How many students are there?... ");
	int[] arrScores = new int[input.nextInt()];
	String[] arrGrades = new String[arrScores.length];
	System.out.print("Enter the " + arrScores.length + " test scores: ");
	for (int i = 0; i < arrScores.length; i++) 
            {
		arrScores[i] = input.nextInt();
	}
	getGrades(arrScores, arrGrades);
	for (int i = 0; i < arrScores.length; i++)
            {
		System.out.println("Student " + (i + 1) + " score is " + arrScores[i] + " and the grade is a " + arrGrades[i]);
	}///I dont like the idea of having a "student 0"
}
public static int maxScore(int[] arrmax) 
    {
	int max = arrmax[0];
	for (int i = 1; i < arrmax.length; i++)
            {
		if (arrmax[i] > max)
			max = arrmax[i];
	}
	return max;
}
public static void getGrades(int[] scores, String[] grades) 
    {
	int bestScore = maxScore(scores);
	for (int i = 0; i < scores.length; i++) 
            {
		if (scores[i] >= bestScore - 10)
			grades[i] = "A";
		else if (scores[i] >= bestScore - 20)
			grades[i] = "B";
		else if (scores[i] >= bestScore - 30)
			grades[i] = "C";
		else if (scores[i] >= bestScore - 40)
			grades[i] = "D";
		else
			grades[i] = "F";
	}
} 

}
