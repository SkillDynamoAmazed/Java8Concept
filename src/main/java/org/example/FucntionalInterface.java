package org.example;

interface Convert{
    public String convert(String str);
}
public class FucntionalInterface {

    public static void main(String[] args) {

//        Convert c = new Convert() {
//            public String convert(String str) {
//                return str.toUpperCase();
//            }
//        };
        //Lambda Expression ::::::::::::::::
        Convert c = (str)->{return str.toUpperCase();};

        System.out.println(c.convert("Sundaram"));
    }
}
