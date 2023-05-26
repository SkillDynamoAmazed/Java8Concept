package org.example;

import java.util.Arrays;

public class ReplaceArray {

    public static void main(String[] args) {
        int arr[] = {1,2,8,14,-1,-1};
        int b[] = {9,12};
        int k =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                arr[i] = b[k];
                k++;
            }
        }
        Arrays.sort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
