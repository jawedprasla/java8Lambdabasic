package com.jprasla.unit2;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        doProcess( a, i -> System.out.println(a + b));



    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

    interface Process{
        void process(int i);
    }
}
