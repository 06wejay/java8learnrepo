import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

/**
 * print alphabet based on corresponding sum of given digit - Using Java8
 * @since 10/20/2021
 */
public class FunctionStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Function<Integer,Integer> findSum = (n)->{
            int sum = 0;
            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            return sum;
        };
        Function<Integer,String> charFound = (i)-> i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
        int value = findSum.apply(num);
        if(value<26)
            System.out.println(findSum.andThen(charFound).apply(num));
        else {
            String toPrint = findSum.andThen(charFound).apply(value);
            System.out.println(toPrint);
        }
    }
}
