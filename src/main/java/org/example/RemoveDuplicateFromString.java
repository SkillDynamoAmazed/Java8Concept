package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String s = "aaaabbcccddd";

        char[] c1 = s.toCharArray();
        int count =0;

        HashSet<Character>myset = new HashSet<>();

        for(int i=0;i<s.length();i++){
          boolean flag =  myset.add(c1[i]);
          if(flag==false){
              count++;
          }
        }
        System.out.println(count);

        StringBuffer sb = new StringBuffer();

        for(char c:myset){
            sb.append(c);
        }
        System.out.println(sb.toString());
      

    }
}
