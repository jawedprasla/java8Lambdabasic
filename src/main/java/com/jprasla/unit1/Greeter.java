package com.jprasla.unit1;

public class Greeter {

    public static void greet(Greeting greeting){
        greeting.perform();

    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldgreeting helloWorldgreeting = new HelloWorldgreeting();
        greeter.greet(helloWorldgreeting);

    }
}
