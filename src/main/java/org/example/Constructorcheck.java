package org.example;

class A{

    public A(){
        super();
        System.out.println("In Class A");
    }

    public A(int n){
        System.out.println("In class Int A");
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("In class B");
    }

    public B(int n){
        this();
        System.out.println("In class Int B");
    }
}



public class Constructorcheck {

    public static void main(String[] args) {

        B obj = new B(5);

    }
}