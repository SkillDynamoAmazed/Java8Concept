package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {

        //SUM OF LIST ELEMENTGS USING REDUCE THAT CONVERST INTO OPTIONAL
        List<Integer>myList = new ArrayList<>(Arrays.asList(1,1,221,221,322,433,744,258,19));

      Optional<Integer>sum =  myList.stream().reduce((a, b)->a+b);
      System.out.println(sum.get());


      //AVERTAGE OF ALL NUMBERS
        double myaverage = myList.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("Average is "+ myaverage);


        //SQUARE OF EACH NUMBER
        double mydouble = myList.stream().map(n->n*n).filter(n->n>49).mapToInt(e->e).average().getAsDouble();
        System.out.println(mydouble);

        //Print Even Numbers

        List evenlist = myList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenlist);

        //Print Odd Numbers

        List oddlist = myList.stream().filter(n->!(n%2==0)).collect(Collectors.toList());
        System.out.println(oddlist);

        //Print numbers Starting with Two
        //Here I have used :: to specify the mapping of integer to value of int
        List<Integer> numbs = myList.stream().map(n->Integer.toString(n)).filter(n->n.startsWith("7")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(numbs);

        //Print Duplicates from list
        Set<Integer>myset = new
                HashSet<>();
        List<Integer>duplicates = myList.stream().filter(n->(myset.add(n))).collect(Collectors.toList());
        System.out.println("suplicates"+duplicates);


        //Stream to find the Max and min numbers from list
        int max = myList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max is " +max);

        int min = myList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min is " +min);

        //Sort Numbers from list and return in desc or ascending order

         List<Integer>list1 = myList.stream().sorted().collect(Collectors.toList());
         System.out.println("Sorted list is in ascending order "+ list1);

         List<Integer>list2 = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
          System.out.println("Sorted List is in descending order" + list2);

          //Get First 5 numbers and then add the numbers using java streams

           Optional sum1 = myList.stream().skip(5).reduce((a,b)->a+b);
      System.out.println("The first 5 sum  is"+ sum1.get());


        //Get Second Highest and lowest Numbers using streaam.
        int sechigh = myList.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();

        System.out.println("My second Max is "+ sechigh);

        int seclow  = myList.stream().sorted().distinct().limit(2).skip(1).findFirst().get();

        System.out.println("My second Min is "+ seclow);




    }
}
