package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamfirst {

    public static void main(String[] args) {

        String s  = "aaabbbccddeffffg";

        Set<Character>myset = new HashSet<>();

            Set mynew = s.chars().mapToObj(c->(char)c).filter(c->myset.add(c)).collect(Collectors.toSet());
        System.out.println(mynew);


//        char c[] = s.toCharArray();
//
//        HashMap<Character,Integer>mymap = new HashMap<>();
//
//
//        for(char c1:c){
//          if(mymap.containsKey(c1)) {
//
//              mymap.put(c1, mymap.get(c1) + 1);
//          }
//          else {
//              mymap.put(c1, 1);
//          }
//        }
//
//       for(char c1:c){
//           if(mymap.get(c1)>1){
//               System.out.println("The first Repeating character is "+c1);
//               break;
//           }
//       }
//
//       for(char c1:c){
//           if(mymap.get(c1)==1){
//               System.out.println("The first Non Repeating character is "+ c1);
//               break;
//           }
//       }

    }
}
