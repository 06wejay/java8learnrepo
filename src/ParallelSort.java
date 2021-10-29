/**
 * A simple program for comparing the speed of serial sorting and Java8 Parallel sorting
 * Done in Intel core i7 machine
 */

import java.util.Arrays;
import java.util.Random;

public class ParallelSort {
    public static void main(String[] args) {

        int[] numbers = new int[1000];
        Random rand = new Random();

        for (int j = 0; j < 1000; j++) {
            numbers[j] = rand.nextInt();
        }

        long startTime = System.nanoTime();

        /*Serial Sort*/
        Arrays.sort(numbers);
        long endTime = System.nanoTime();
        System.out.println("Time taken by Serial Sort(in ns): "
                + (endTime - startTime));
        startTime = System.nanoTime();

        /*Performing Parallel Sort*/
        Arrays.parallelSort(numbers);
        endTime = System.nanoTime();
        System.out.println("Time taken by Parallel Sort(in ns): "
                + (endTime - startTime));
        System.out.println();
    }
}

