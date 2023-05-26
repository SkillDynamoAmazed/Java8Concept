package org.example;

import java.util.HashSet;
import java.util.Set;

public class StringMinRepeatFromArray {

    public static int minrepeat(String str){
        Set<Character> myset = new HashSet<>();
        int count =0;
        char c[]  = str.toCharArray();
        for(char c1:c){
            boolean flag = myset.add(c1);
            if(flag==false){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int min1 = Integer.MAX_VALUE;
        int flag =0;
        String[] s = {"aaabb","aabc","abcddddfd"};
        for(int i=0;i<s.length;i++){
             int min = minrepeat(s[i]);
            if(min<min1){
                min1 = min;
                flag = i;
            }

        }
        System.out.println(min1+" String is  "+s[flag] );
    }


}
