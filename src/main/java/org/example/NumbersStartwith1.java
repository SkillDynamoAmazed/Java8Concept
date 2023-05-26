package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartwith1 {

    public static void main(String[] args) {
        List<Integer> mylist =  new ArrayList<>(Arrays.asList(1,123,141,3,5,7,88));
       List mynew =  mylist.stream().filter(x->Integer.toString(x).startsWith("1")).collect(Collectors.toList());
        System.out.println(mynew);

       List my=  mylist.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());

        System.out.println(my);

    }


}
