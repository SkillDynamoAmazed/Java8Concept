package org.example;

import java.util.*;

public class ComparatorImple {
    public static void main(String[] args) {
        Comparator<Comparable> comparator = new Comparator<>() {
            @Override
            public int compare(Comparable o1, Comparable o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        List<Comparable> mylist = new ArrayList<>();


        mylist.add(new Comparable(2000,23,"Sundaram"));
        mylist.add(new Comparable(40000,26,"Satyam"));
        mylist.add(new Comparable(4000,32,"Alam"));
        Collections.sort(mylist,comparator);

    }





}




