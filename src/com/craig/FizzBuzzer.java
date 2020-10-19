package com.craig;

public class FizzBuzzer implements IFizzBuzz {

    private static FizzBuzzer fizzBuzzerInstance= null;

    private FizzBuzzer (){}

    public static FizzBuzzer getInstance(){
        if(fizzBuzzerInstance==null)
            fizzBuzzerInstance = new FizzBuzzer();

        return fizzBuzzerInstance;
    }



    @Override
    public void doFizzBuzz() {
        for(int i=1;i<=500;i++){
            if (i % 6 == 0 && i % 10 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 6 == 0) {
                    System.out.println("Fizz");
                } else if (i % 10 == 0) {

                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }

    }
