import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Scenario 2 - Filter out even numbers and print it using java7 and java8.
 *
 * @since 10/12/2021
 */
public class evenStream {
    public static void main(String[] args) {

        /*creating a list of integers*/
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        /*printing the even by Java7*/
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
        /*printing the even by Java8*/
        List<Integer> filtered = array.stream().filter(number->number%2==0).collect(Collectors.toList());
        System.out.println(filtered);
    }
}