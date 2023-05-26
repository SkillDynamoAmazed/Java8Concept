package org.example;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountUsingStream {

    public static void main(String[] args) {
        String s = "Sunuuuunnndddd11123334ef";
//        HashMap<Character,Integer>mymap = new HashMap<>();
//        char c[] = s.toCharArray();
//        for(char c1: c){
//            if(mymap.containsKey(c1)){
//                mymap.put(c1,mymap.get(c1)+1);
//            }
//            else{
//                mymap.put(c1,1);
//            }
//        }
//        System.out.println(mymap);
//    }

        Map<Character,Long> mymap = s.chars().
                                        mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(mymap);



}}
