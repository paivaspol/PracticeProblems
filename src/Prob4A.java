import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 314159 on 10/21/2016.
 * Attempt: 10/21/2016
 *
 * Solution summary:
 *  First, we don't need to care about odd numbers.
 *  Then, for even numbers, just iterate through the numbers
 *  by keep adding 2 at a time having i and j and see whether
 *  they can add up to w or not.
 */
public class Prob4A {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.valueOf(input.readLine());
        if (w % 2 != 0) {
            // An odd integer can never be split into two even numbers.
            System.out.println("NO");
        } else {
            boolean found = false;
            for (int i = 2; i < w && !found; i += 2) {
                for (int j = i; j + i <= w; j += 2) {
                    if (j + i == w) {
                        found = true;
                        break;
                    }
                }
            }
            String result = (found) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
