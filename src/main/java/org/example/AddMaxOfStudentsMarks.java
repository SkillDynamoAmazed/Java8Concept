package org.example;

import java.util.HashMap;
import java.util.Map;

public class AddMaxOfStudentsMarks {

    public static void main(String[] args) {


        int roll[] = {1, 2, 1, 2, 3};
        int marks[] = {20, 40, 60, 30, 90};

        HashMap<Integer, Integer> mymap = new HashMap<>();

          for(int i=0;i<roll.length;i++){
              int rollnumber = roll[i];
              int mark = marks[i];

              if(mymap.containsKey(rollnumber)){
                  mymap.put(rollnumber,Math.max(mymap.get(rollnumber),mark));
              }
              else{
                  mymap.put(rollnumber,mark);
              }
          }
          int sum = 0;
          for(Map.Entry<Integer,Integer>entry:mymap.entrySet()){
              sum =sum+entry.getValue();
          }
        System.out.println("Sum of total Marks is " + sum);
        }

}