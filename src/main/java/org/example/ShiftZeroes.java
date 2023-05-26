package org.example;

public class ShiftZeroes {

    public static void main(String[] args) {

        int arr[]  = {0,0,0,12,2,3};
            int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }

    }

    //Shift Zeroes to the end of array




}
