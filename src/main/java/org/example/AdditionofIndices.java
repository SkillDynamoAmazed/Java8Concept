package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;

public class AdditionofIndices {

    public static void main(String[] args) {

//        int arr[] = {3,2,4};
//        int target = 6;
//        int b[] = new int[arr.length];
//        int sum = 0;
//        int count =0;
//        for (int i = 0; i < arr.length; i++) {
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i+" "+j);
//                }
//            }
//        }


        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = {3,5,8,1};
        int target = 9;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }}
