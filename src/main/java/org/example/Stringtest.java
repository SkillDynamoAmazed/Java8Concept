package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Stringtest {

    public static void main(String[] args) {

//        List<String>mylist1 = Arrays.asList("abc","def");
//        List<String>mylist2 = Arrays.asList("ghi","jkl");
//
//        List<List<String>>myfinal = new ArrayList<>();
//        myfinal.add(mylist1);
//        myfinal.add(mylist2);
//
//       List myfinal2 =  myfinal.stream().flatMap(l->l.stream()).collect(Collectors.toList());
//        System.out.println(myfinal);
//        System.out.println(myfinal2);


//        int n = 123;
//        int sum = 0;
//
//        while(n!=0){
//            int  r = n%10;
//             sum = sum*10 + r;
//             n = n/10;
//        }
//
//        System.out.println(sum);

//        String input = "welcome to the world.my spaces,comma and words are perfect.";
//        String[] sentences = input.split("[.!,]");
//
//        StringBuilder output = new StringBuilder();
//
//        for (String sentence : sentences) {
//            String trimmed = sentence.trim();
//            if (trimmed.length() > 0) {
//                String firstChar = trimmed.substring(0, 1);
//                String capitalized = firstChar.toUpperCase() + trimmed.substring(1);
//                output.append(capitalized).append(". ");
//            }
//        }
//        String finalOutput = output.toString().trim();
//        System.out.println(finalOutput);
//
//    }
//
//        List<String>mylist = new ArrayList<>(Arrays.asList("Sundaram","Mishra","Satyam"));
//        System.out.println(mylist);
//       List mynew =  mylist.stream().map(l->new StringBuffer(l).reverse()).collect(Collectors.toList());
//        System.out.println(mynew);



//        List mymain = mylist.stream().map(l->new StringBuffer(l).reverse()).collect(Collectors.toList());


//        List<String>mylist = new ArrayList<>(Arrays.asList("cat","dog","hello","act","god","tac"));
//        List<String>my1 = new ArrayList<>();
//        for(int i=0;i<mylist.size();i++){
//            for(int j=i+1;j<mylist.size();j++){
//                String s = mylist.get(i);
//                StringBuilder s1 = new StringBuilder(s);
//                String m1 =  mylist.get(j);
//                String rev  = String.valueOf(s1.reverse());
//                if(rev.equals(m1)){
//                    my1.add(s);
//                    my1.add(m1);
//                }
//            }
//
//        }
//        System.out.println(my1);

//        String s = "CCCCTYYBC";
//
//        char c[] = s.toCharArray();
//
//        List<Character>my1= new ArrayList<>();
//
//        for(char c1:c){
//            my1.add(c1);
//        }
//
//        Set<Character>myset = new HashSet<>();
//
//        List updated = my1.stream().filter(l->!myset.add(l)).collect(Collectors.toList());
//
//        System.out.println(updated.toString());

//        String input = "CCCCTYYBC";
//        StringBuilder sb = new StringBuilder();
//        char prev = '\0';
//        for (int i = 0; i < input.length(); i++) {
//            char curr = input.charAt(i);
//            if (curr != prev) {
//                sb.append(curr);
//                prev = curr;
//            }
//        }
//        System.out.println(sb.toString()); // Output: CTYBC

//
//        import java.util.Arrays;
//import java.util.Comparator;

//        public class SimpleSortExample {
//            public static void main(String[] args) {
//                String[] array = {"adarsh", "raj", "sohail", "karan"};
//                String sortString = "rsak";
//
//                Arrays.sort(array, Comparator.
//                        comparingInt(a ->
//                        sortString.indexOf(a.charAt(0))));
//
//                System.out.println(Arrays.toString(array));
//            }
//        }


//
//
//        String haystack = "butsad";
//        String needle = "sad";

//        if(haystack.contains(needle)){
//            int count =0;
//            int length = needle.length();
//            for (int i = 0; i < haystack.length() - length + 1; i++) {
//                // Check if the substring equals to the needle
//                if (haystack.substring(i, i + length).equals(needle)) {
//                    System.out.println("index "+ i);
//                }
//                else{
//                    System.out.println("index "+ 0);
//                }
//
//            }
//            System.out.println("count is "+count);
//
//    }

}}
