package org.example;

import java.util.*;

public class Scoremocha {

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
        int count = 0;
        int arr[] = {24,6};
        int b[] = new int[arr.length];

        List<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            mylist.add(arr[i]);
        }

        int b1[] = new int[10];
        b1 = mylist.stream().mapToInt(Scoremocha::getsum).toArray();
        int c1[] = new int[b1.length + arr.length];
        for (int i = 0; i < arr.length; i++) {
            c1[i] = arr[i];
            count++;
        }
        for (int i = 0; i < b1.length; i++) {
            c1[count] = b1[i];
            count++;
        }
       int flag =0;
        Set<Integer>myset = new HashSet<>();
        for (int i = 0; i < c1.length; i++) {
            myset.add(c1[i]);
        }
        System.out.println(myset.size());

    }

}


