package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Collection {
    public static void main(String[] args) {
//        String str[]  = {"a","b","c","d"};
//
//        for(String s :str){
//            System.out.println(s);
//        }
//
//        ArrayList<String> al = new ArrayList(Arrays.asList(str));
//        List a1 = al.stream().filter(a->a.equals("a")).collect(Collectors.toList());
//        System.out.print(a1);
//        for(String s1:al){
//            System.out.println("FROM ARRAY LIST;;;;;;;;;;;;;;");
//            System.out.println(s1);
//        }

//        HashSet hs = new HashSet();
//        hs.add(100);
//        hs.add("Sundaram");
//        System.out.println(hs);
//        Iterator it = hs.iterator();
//
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }

        int leftsum =0;
        int rightsum=0;
        int finalpivot=-1;

        int nums[] = {1,1,1,3,2,1};
        for(int i=0;i<nums.length;i++){
            int pivot = i;

            for(int j=0;j<pivot;j++){
                leftsum = leftsum+nums[j];
            }

            for(int k=pivot+1;k<=nums.length-1;k++){
                rightsum = rightsum + nums[k];
            }

            if(leftsum==rightsum){
                finalpivot = pivot;
                break;
            }
            leftsum=0;
            rightsum=0;

        }
       System.out.println("THE PIVOT IS " + finalpivot);
        System.out.println(IntStream.range(1,5).sum());
}



}
