import java.util.Arrays;
import java.util.Scanner;

/**
 * Scenario 1 - Print the numbers using Java7 and Java8.
 *
 * @since 10/12/2021
 */
public class arraysAndStreams {
    public static void main(String[] args) {

        /*Scanning the input*/
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = scan.nextInt();
        }
        /*print using Java7-forEach*/
        for(int number:array){
            System.out.println(number);
        }
        /*print using Java8-streams-using Method reference*/
        Arrays.stream(array).forEach(System.out::println);

        /*Another way- baked in Arrays method*/
        System.out.println(Arrays.toString(array));
    }
}