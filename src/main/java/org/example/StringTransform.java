package org.example;

import java.io.CharArrayReader;

public class StringTransform {

    public static void main(String[] args) {

        String s = "welcome to the world.my spaces,comma and words are perfect.";

        StringBuffer sb = new StringBuffer();

        boolean capitalized  = true;

        for(char c :s.toCharArray()){
           if(capitalized && Character.isLetter(c)){
               sb.append(String.valueOf(c).toUpperCase());
               capitalized = false;
           }
           else{
               sb.append(c);
           }

           if(c=='.'||c==','){
               sb.append(" ");
               capitalized = true;

           }
        }

        System.out.println(sb.toString());



    }



}
