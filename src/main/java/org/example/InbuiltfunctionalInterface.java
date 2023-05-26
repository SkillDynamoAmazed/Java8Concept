package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InbuiltfunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer>checkeven = number->number%2!=0;
        System.out.println(checkeven.test(11));

        Predicate<Integer>checkequality = number->number>50;

        List<Integer>mylist = new ArrayList<>(Arrays.asList(10,20,35,2,1,5,55));

         Predicate<Integer>combined= checkeven.and(checkequality);

         List mylis = mylist.stream().filter(combined).collect(Collectors.toList());

        System.out.println("THE FINAL LIST IS " + mylis);
        Function<String,Integer> mytest = s->s.length();
        System.out.println(mytest.apply("Sundaram"));

        Consumer<String>myconsumer = s-> System.out.println(s);
        myconsumer.accept("SundaramMishra");

        Supplier<Double>mysupplier = ()->Math.random();
        System.out.println(mysupplier.get());




    }
}
