package Scenarios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;
public class PrimeComposite {

    void primeOrComposite(int n) {
        Predicate<Integer> toFind = (x) -> {
            for(int i=2;i<x/2;i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        };
        if (n <= 1)
            System.out.println("Neither Prime Nor Composite");
        else {
            if (toFind.test(n)) {
                Consumer<Integer> found = (x) -> {
                    System.out.println("Prime");
                };
                found.accept(n);
            } else {
                System.out.println("Composite");
            }
        }
    }

    void findFactorial(int n) {
        Consumer<Integer> con = (a) -> {
            long toFind = LongStream.rangeClosed(1,n).reduce(1,(long x,long y)->x*y);
            System.out.println(toFind);
        };
        con.accept(n);
    }
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine().trim());
            PrimeComposite xyz = new PrimeComposite();
            xyz.primeOrComposite(n);
            xyz.findFactorial(n);

        }
    }

