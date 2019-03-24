package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] tenInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] hoursWork = {{3, 2, 5, 6, 8}, {3, 2, 1, 6, 8}, {3, 2, 5, 6, 4}};
        ArrayList<String> myStringOne = new ArrayList<>();
        List<Integer> myStringTwo = new ArrayList<>();

        for (int s : tenInteger) {

            myStringTwo.add(s);
        }
        for (int v : myStringTwo) {
            System.out.println(v);
        }
        int mySum = 0;
        for (int i = 0; i < 5; i++) {
            mySum = mySum + i;
        }
        System.out.println("The sum is " + mySum);
        System.out.println("The size or rows of Array is " + hoursWork.length);
        System.out.println("The number og  colunms are " + hoursWork[0].length);
        System.out.println("The size or row of tenInteger is " + tenInteger.length);
        myStringOne.add("The new String is not good for me ");

        Person person = new Person();
        Person person1 = new Person();
        Person p1 = new Person();
        Person person2 = new Person(1,"you", "souare", "Wondy");

        Person person3 = new Person();
        Person p5 = new Person();
        Person p6 = new Person(2, "Youssouf", "Souare", "Denmark");

        List<Person> newPerson = new ArrayList<Person>();

        newPerson.add(p6);
        newPerson.add(person2);

        for (Person p : newPerson) {
            System.out.println(p.toString());
        }







    }
}
