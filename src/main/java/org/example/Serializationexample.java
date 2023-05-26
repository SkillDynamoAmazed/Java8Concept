package org.example;

import java.io.*;

public class Serializationexample {

//    public Serializationexample() {
//        age = 90;
//        System.out.println("Default constructor called");
//    }

    public Serializationexample(int age) {
        this.age = age;
    }

    int age;


}

 class Child1 extends Serializationexample implements Serializable{

     String name;
     public Child1() {
         super(27);
     }
 }
 class Main1{
    public static void main(String[] args) throws FileNotFoundException, IOException , NotSerializableException,ClassNotFoundException {

        FileOutputStream fout  = new FileOutputStream("D:\\SETUPS\\Char.txt");
        ObjectOutputStream objout = new ObjectOutputStream(fout);
//        Serializationexample s = new Serializationexample();
        Child1 s = new Child1();
        s.name="sundarammm";
        s.age = 27;
         objout.writeObject(s);
         objout.close();
        System.out.println("File is created....");

        FileInputStream fin = new FileInputStream("D:\\SETUPS\\Char.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);
        Child1 s1 = (Child1)objin.readObject();
        System.out.println("My name is " + s1.name);
        System.out.println("My age is " +s1.age);
    }



}
