package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sortstringbyanother {

    public static void main(String[] args) {
      String[]mystring = {"adarsh","raj","sohail","karan"};

      List<String>mylist  = new ArrayList<>();

      String sort = "kasr";

      for(int i=0;i<sort.length();i++){
          for(int j=0;j<sort.length();j++){
              if(sort.charAt(i)==mystring[j].charAt(0)){
                  mylist.add(mystring[j]);
              }
          }

      }

      for(String c:mylist){
          System.out.println(c);
      }


    }
}
