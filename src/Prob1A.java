import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 314159 on 10/21/2016.
 * Attempt: 10/21/2021
 *
 * Solution Summary:
 * m x n rectangle. Least number of a x a squares to fill up m x n rectangle.
 * Find number squares to cover width of m by taking the ceil of m / a.
 * Do the same thing for height (n).
 */
public class Prob1A {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = input.readLine().split(" ");
        int m = Integer.valueOf(inputLine[0]);
        int n = Integer.valueOf(inputLine[1]);
        int a = Integer.valueOf(inputLine[2]);
        int totalWidth = (int) Math.ceil(1.0 * m / a);
        int totalHeight = (int) Math.ceil(1.0 * n / a);
        int result = totalHeight * totalWidth;
        System.out.println(result);
    }
}
