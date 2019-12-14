package com.hyunwoo.chapter11proxy;

import lombok.Getter;

public class GumballMachine {

    @Getter
    String location;

    @Getter
    int count;

    @Getter
    String state;

    public GumballMachine(String location, int count) {
        this.state = "wating for quarter";
        this.location = location;
        this.count = count;
    }

}
