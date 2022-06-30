package pak;
import java.util.*;
public class Hour {
	public static void main(String[] args) {
        int[][] weekHours
                = {
                    {2, 4, 3, 4, 5, 8, 8},
                    {7, 3, 4, 3, 3, 4, 4},
                    {3, 3, 4, 3, 3, 2, 2},
                    {9, 3, 4, 7, 3, 4, 1},
                    {3, 5, 4, 3, 6, 3, 8},
                    {3, 4, 4, 6, 3, 4, 4},
                    {3, 7, 4, 8, 3, 8, 4},
                    {6, 3, 5, 9, 2, 7, 9},};
        String[] days = {"\t      su", "\tm", "\tt", "\tw", "\tth", "\tf", "\tsa", "\ttotal"};
        int[] totalHours = sumRows(weekHours);

        
        
        System.out.println(Arrays.deepToString(days));
        for (int r = 0; r < weekHours[0].length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < weekHours[r].length; c++) {
                System.out.print("\t" + weekHours[r][c]);

            }
            System.out.print("\t" + totalHours[r]);
            System.out.println();
        }
    }

    public static int[] sumRows(int[][] m) {
       int[] sum = new int[m.length];
        for (int row = 0; row < m.length; row++) {
           for (int c = 0; c < m[row].length; c++) {
                sum[row] += m[row][c];

            }
        }
        return sum;
    }

}
