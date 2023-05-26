package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable implements java.lang.Comparable<Comparable> {

   private int salary;
   private int age;

    public Comparable(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public int compareTo(Comparable o) {
        if(this.name.compareTo(o.getName())>0){
            return 1;
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {
        List<Comparable>mylist = new ArrayList<>();
        mylist.add(new Comparable(2000,23,"Sundaram"));
        mylist.add(new Comparable(40000,26,"Satyam"));
        mylist.add(new Comparable(4000,32,"Alam"));

        Collections.sort(mylist);
        System.out.println(mylist);

    }
}
