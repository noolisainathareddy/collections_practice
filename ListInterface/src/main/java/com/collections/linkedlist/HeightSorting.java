package com.collections.linkedlist;

import java.util.Comparator;

public class HeightSorting implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){
        Float change1 = Float.valueOf(s1.getHeight());
        Float change2 = Float.valueOf(s2.getHeight());
        return change1.compareTo(change2);

    }
}
