package com.coderbd.entity;

public class TvImpl extends Tv {

    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");
    }

}
