/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Rajail Islam
 */
public class RandomTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "A"));
        list.add(new Student(102, "B"));
        list.add(new Student(103, "C"));
        list.add(new Student(104, "D"));
        list.add(new Student(105, "E"));
        list.add(new Student(106, "F"));
        list.add(new Student(107, "G"));
        list.add(new Student(108, "H"));
        list.add(new Student(109, "I"));
        list.add(new Student(110, "J"));

        RandomTest obj = new RandomTest();

        for (int i = 0; i < 10; i++) {

            System.out.println(obj.getRandomList(list).getName());
        }

    }

    public static Student getRandomList(List<Student> list) {
        int index = ThreadLocalRandom.current().nextInt(list.size());
        System.out.println("Index: " + index);
        Student s = new Student();
        s.setId(list.get(index).getId());
        s.setName(list.get(index).getName());
        return s;
    }
}
