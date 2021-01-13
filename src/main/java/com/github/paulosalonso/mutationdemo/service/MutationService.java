package com.github.paulosalonso.mutationdemo.service;

public class MutationService {

    public int intReturn(int value) {
        if (value > 10) {
            return value * 3;
        } else if (value < 10) {
            return value * 5;
        }

        return value * 10;
    }
}
