package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EvenandOddsumequal {
//    public static void main(String[] args) {
//        int arr[] = {1,3,2,4,5,8,5};
//        int evensum = 0;
//        int oddsum = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                evensum = evensum+arr[i];
//
//            }
//            else{
//                oddsum = oddsum+arr[i];
//            }
//
//        }
//        if(oddsum==evensum){
//            System.out.println("Even and Odd sum are Equal");
//        }
//        else{
//            System.out.println("Even and Odd suma are not equal");
//        }
//    }

//    public static void main(String[] args) {
//
//        int arr[] = {2,7,3,5,1};
//
//        int target = 12;
//
//        int result[] = new int[arr.length/2];
//
//        HashMap<Integer,Integer>mymap = new HashMap<>();
//
//        for(int i=0;i<arr.length;i++){
//            int element = target-arr[i];
//            if(mymap.containsKey(element)){
//                result[0] = mymap.get(element);
//                result[1] = i;
//            }
//            else{
//                mymap.put(arr[i],i);
//
//            }
//
//        }
//        for(int i :result){
//            System.out.println(i);
//        }
//
//    }

//    public static void main(String[] args) {
//        String  s= "aaabbbbcc";
//
//        char c[] = s.toCharArray();
//
//        HashMap<Character,Integer>mymap = new HashMap<>();
//        for(char c1:c){
//            if(mymap.containsKey(c1)){
//                mymap.put(c1,mymap.get(c1)+1);
//            }
//            else{
//                mymap.put(c1,1);
//            }
//        }
//        System.out.println(mymap);
//
//        int max  = Integer.MIN_VALUE;
//        char c1 = 'a';
//        int arr[] = new int[mymap.size()];
//
//        List<Map.Entry<Character,Integer>> mylist = new ArrayList<>(mymap.entrySet());
//        Collections.sort(mylist,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
//        System.out.println(mylist.get(1));
//
//    }

    public static void main(String[] args) {
        int arr[]  = {1,2,4,5,8,10};
        List<Integer> mylist = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort(mylist,(e1,e2)->e1.compareTo(e2));
        System.out.println(mylist.get(1));
        int max = mylist.stream().max(Comparator.comparingInt(Integer::intValue)).get();

        List<Integer>my1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer>my2 = new ArrayList<>(Arrays.asList(2,4,6,8,10));





        System.out.println(mylist);
        System.out.println(max);
    }


}
