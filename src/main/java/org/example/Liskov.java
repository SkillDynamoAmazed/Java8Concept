package org.example;

public class Liskov {
    public Liskov() {
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Liskov(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;

    @Override
    public String toString() {
        return "Liskov{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class  Mytt {


    public static void main(String[] args) {
            Liskov l = new Liskov(10,"ssss",23);
        System.out.println(l);
    }
}