package com.collections.list;

import java.util.*;

public class ArrayListDemo {
    public void impl(){
        Employee employee;

        List<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("sai natha", 50));
        arrayList.add(new Employee("Hemanth", 27));
        arrayList.add(new Employee("siva prasad", 29));
        arrayList.add(new Employee("Raja gopal", 53));
        arrayList.add(new Employee("Raja Reddy", 55));


        for(int i=0;i < arrayList.size(); i++ ){
            System.out.println(arrayList.get(i));
        }
        System.out.println("after ---------------- sorting");

        Collections.sort(arrayList);

        for(int i=0;i < arrayList.size(); i++ ){
            System.out.println(arrayList.get(i));
        }

//        System.out.println("came here");
//        for(int i=0;i < arrayList.size(); i++ ){
//            System.out.println(arrayList.get(i));
//        }

//        System.out.println(arrayList.contains(5));
//        ListIterator<Integer> listiterator = arrayList.listIterator();
//        while(listiterator.hasNext()){
//            System.out.println(listiterator.next());
//        }
//        while(listiterator.hasPrevious()){
//            System.out.println(listiterator.previous());
//        }

//        //Uisng for each loop
//        for(Integer x : arrayList){
//           System.out.println(x);
//        }

//          Using iterator
//        Iterator<Integer> iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


    }
}

