package com.hyunwoo.chapter11proxy;

import lombok.Getter;

public class GumballMachine {

    @Getter
    String location;

    public GumballMachine(String location, int count) {
        this.location = location;
    }

}
