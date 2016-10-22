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
        long m = Long.valueOf(inputLine[0]);
        long n = Long.valueOf(inputLine[1]);
        long a = Long.valueOf(inputLine[2]);
        long totalWidth = (long) Math.ceil(1.0 * m / a);
        long totalHeight = (long) Math.ceil(1.0 * n / a);
        long result = totalHeight * totalWidth;
        System.out.println(result);
    }
}
