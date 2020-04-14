package com.jprasla.unit2;
//Using this in lambda does not change value. It uses the same instance of the caller.
//However using this in anonymous class will refer to the anonymous
public class ThisReferenceExample {

    public void doProcess(int i, ClosuresExample.Process p){
        p.process(i);
    }

    public void execute(){

        doProcess(10, i -> {
            System.out.println("Value of i is "+ i);
            System.out.println(this);
        });
    }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.execute();

    }

    @Override
    public String toString() {
        return "This is the main ThisReferenceExample Class instance";
    }
}
