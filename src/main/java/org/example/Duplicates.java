package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {


        List<Integer>mylist = new ArrayList<>(Arrays.asList(10,15,8,49,8,32,32,25,98,32));

//         HashMap<Integer,Integer> mymap = new HashMap<>();
//        int arr[] = new int[mylist.size()];
//         for(int i=0;i<mylist.size();i++){
//            arr[i] = mylist.get(i);
//         }
//
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length-1;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//
//                 }
//         }

        Set<Integer>myset = new HashSet<>();
                List<Integer> Mylist = mylist.stream().filter(n->myset.add(n)).collect(Collectors.toList());
               for(int a :Mylist){
                   System.out.println(a);
               }
             }
         }
//            for(int i : arr){
//                if(mymap.containsKey(i)){
//                    mymap.put(i,mymap.get(i)+1);
//                }
//                else{
//                    mymap.put(i,1);
//                }
//            }
//
//        Set<Map.Entry<Integer,Integer>> entry = mymap.entrySet();
//
//             for(Map.Entry<Integer, Integer> ent: entry){
//                 if(ent.getValue()>1){
//                     System.out.println(ent.getKey() +" "+ ent.getValue());
//                 }
//    }


