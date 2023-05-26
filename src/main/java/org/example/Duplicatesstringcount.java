package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicatesstringcount {

    public static void main(String[] args) {

        String s = "aaaabbbccccdddeefg";

        Character r = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet()
                .stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();

        System.out.println("nsfdhdsuo"+ r);

//        for(Map.Entry<Character,Long>entry:mymap.entrySet()){
//
//            if(entry.getValue()==1){
//                System.out.println(entry.getKey()+""+entry.getValue());
//                break;
//            }
//
//
//
//
//        }

        List<Integer> mylist = new ArrayList<>(Arrays.asList(10,20,30,49));

        int max = mylist.stream().min((p1,p2)->(p1<p2?-1:1)).get();
        System.out.println(max);



    }


}
