package com.coderbd.interfaces8;

public class Test implements Animal {

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }

    @Override
    public void display() {
        System.out.println("No way.........");
    }
}
