package org.example;

public class Mytest {

    public static void main(String[] args) {

        Liskov l = new Liskov(133,"sttt",34);
        Liskov l1 = new Liskov();
        l.setName("Sundaram");
        System.out.println(l);
        l1.setName("SUNNNNN");
        l1.setAge(233);
        l1.setSalary(1121233);
        System.out.println(l1);

    }
}
