package org.example;

import java.sql.SQLOutput;

interface Parse{
    public String parseString(String str);
}
class  ConvertString{

     public static String convertToUpperCase(String str){
         if(str.length()<3)
             return str.toUpperCase();
         else
             return str.toLowerCase();
     }
}


class  ConvertStringtoSub{

    public static String convertToSubstring(String str){
        if(str.length()<3)
            return str.substring(1);
        else
            return str.substring(1,str.length());
    }
}
class MyPrinter{

     public void print(String str,Parse p){

//         str = p.parseString(str);
         System.out.println(p.parseString(str));
     }

}
public class JavaMethodReference {

    public static void main(String[] args) {

        String s = "Sundaram";

//        Parse p1 = new Parse() {
//            @Override
//            public String parseString(String str) {
//                return ConvertString.convertToUpperCase(str);
//            }
//        };
        MyPrinter p = new MyPrinter();
        p.print(s,ConvertString::convertToUpperCase);
p.print(s,ConvertStringtoSub::convertToSubstring);
    }

}
