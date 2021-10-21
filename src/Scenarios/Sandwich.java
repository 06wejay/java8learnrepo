package Scenarios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Sandwich {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        Sandwich.storeElements(input);
    }

    private static void storeElements(String input) {
        Predicate<String> stringPredicate = (str)-> str.equals("corn sandwich") || str.equals("cheese sandwich")||str.equals("mix veg sandwich");
        List<String> resultList = new ArrayList<>();
        Consumer<String> toFind = (str)->{
            ArrayList<String> got =  new ArrayList<>(Arrays.asList(str.split(",")));
           for(String toget : got){
               if(stringPredicate.test(toget)){
                   resultList.add(toget);
               }else{
                   System.out.println("Incorrect Output");
                   return;
               }
           }
           resultList.forEach(System.out::println);
        };
        Supplier<List<String>> output = ()->resultList;
        toFind.accept(input);
    }
}
