package com.jprasla.unit2;

import javax.sound.midi.Soundbank;
import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

    public static void main(String[] args) {
        int [] someNumbers = {1, 2, 3, 4 };
        int key = 0;

        //Way 1: This is the easy way to define what operation consumer function should do.
        //However, it's not handling exception.
        //process(someNumbers, key, (v, k) -> System.out.println(v / k));

        //Way 2: Handling exception via try catch block.
        process(someNumbers, key, (v,k) -> {
            try{
                System.out.println(v / k);
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception occurred");
            }
        });

        //Way 3: Handel exception by creating wrapper lambda method
        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
            try{
                consumer.accept(v,k);
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception from wrapper lambda");
            }
        };

    }
}
