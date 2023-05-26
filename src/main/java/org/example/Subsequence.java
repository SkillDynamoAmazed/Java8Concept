package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int nums1[] = {1};
        int nums2[] = {};
        List<Integer> list1 = new ArrayList<>();

        for (int t : nums1) {
            // Add each element into the list
            list1.add(t);
        }

        List<Integer> list2 = new ArrayList<>();

        for (int t : nums2) {

            list2.add(t);
        }

        list2.addAll(list1);
        // Add each element into the list


        Collections.sort(list2);
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)==0){
                list2.remove(i);
            }
        }
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)==0){
                list2.remove(i);
            }
        }

        int[] arr = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++){
            arr[i] = list2.get(i);
            System.out.println(arr[i]);
    }


}}
