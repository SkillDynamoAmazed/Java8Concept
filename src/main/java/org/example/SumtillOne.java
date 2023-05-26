package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumtillOne {

    public static int getsum(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {

        int arr[] = {10,24,35,63,54};

    List<Integer> mylist  = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(mylist);
        int b[] = new int[arr.length];
         b= mylist.stream().mapToInt(SumtillOne::getsum).toArray();
         for(int b1:b){
             System.out.println(b1);
         }

//        mylist.stream().mapToInt(SumtillOne::getsum).toArray();



    }


}
