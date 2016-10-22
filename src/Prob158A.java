import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by 314159 on 10/21/2016.
 * Attempt: 10/21/2016
 *
 * Solution summary:
 * Need to find the value at the k-th position. Then, search to the right
 * to see how many values we need to return.
 */
public class Prob158A {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] controlValues = input.readLine().split(" ");
        int k = Integer.valueOf(controlValues[1]) - 1; // k is indexed starting at 1
        String[] values = input.readLine().split(" ");

        // First, loop over the first k values.
        int finalResult = 0;
        boolean shouldLoopTheRest = true;
        for (int i = 0; i <= k; i++) {
            int currentValue = Integer.valueOf(values[i]);
            if (currentValue > 0) {
                finalResult++;
            } else {
                shouldLoopTheRest = false;
                break;
            }
        }

        int lastValueOfFirstSeq = Integer.valueOf(values[k]);
        for (int i = k + 1; i < values.length && shouldLoopTheRest; i++) {
            int currentValue = Integer.valueOf(values[i]);
            if (currentValue <= 0 || lastValueOfFirstSeq > currentValue) {
                break;
            } else {
                finalResult++;
            }
        }
        System.out.println(finalResult);
    }
}
