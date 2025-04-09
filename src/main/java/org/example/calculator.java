package org.example;

public class calculator implements Icalculator{

    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }

    public Integer sub(Integer a, Integer b) {
        return 0;
    }
}
