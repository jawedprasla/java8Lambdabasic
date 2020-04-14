package com.jprasla.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {

        Thread mythread = new Thread(MethodReferenceExample1::printMessage); // () -> method()
        //MethodReferenceExample1::printMessage  == () -> printMessage()
        mythread.start();

    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
