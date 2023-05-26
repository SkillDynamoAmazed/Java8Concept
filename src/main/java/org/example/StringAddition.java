package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringAddition {
    public static void main(String[] args) {

        String s = "aaabbccccceeeeeeee";

        char c[] = s.toCharArray();

        HashMap<Character,Integer>mymap = new HashMap<>();

        for(char c1 :c){
            if(mymap.containsKey(c1)){
                  mymap.put(c1,mymap.get(c1)+1);
            }
            else{
                mymap.put(c1,1);
            }
        }
        System.out.println(mymap);

        int max =0;
        char maxchar = 'c';

        for(Map.Entry<Character,Integer>entry:mymap.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                maxchar = entry.getKey();

            }
        }
        System.out.println(max+""+maxchar);



    }
}
