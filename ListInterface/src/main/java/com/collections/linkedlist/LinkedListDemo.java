package com.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Student> linkedList= new LinkedList<>();
        Student student;
        linkedList.add(new Student("sai nath", 100, 5.6f));
        linkedList.add(new Student("hemanth", 52, 7f));
        linkedList.add(new Student("siva prasad", 40, 4f));
        linkedList.add(new Student("Gopal", 20, 15f));
        linkedList.add(new Student("Raja", 13, 3f));

        for(Student  i : linkedList){
            System.out.println(i);
        }

        AgeSort ageSort=new AgeSort();

        HeightSorting heightSorting = new HeightSorting();
        Collections.sort(linkedList, heightSorting);

        System.out.println("After ------ sorting");
        for(Student  i : linkedList){
            System.out.println(i);
        }






    }
}
