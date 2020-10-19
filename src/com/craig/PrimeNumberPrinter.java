package com.craig;

public class PrimeNumberPrinter implements PrimeNumber{

    private final StringBuilder primeNums;

    public PrimeNumberPrinter(int num) {
        primeNums = new StringBuilder();
        if(isPrime(num))
            primeNums.append(num);
    }

    public PrimeNumberPrinter(int lowerLimit, int upperLimit) {
        primeNums = new StringBuilder();
        calcPrimeNumInRange(lowerLimit,upperLimit,primeNums);

    }

    private void calcPrimeNumInRange(int lowerLimit,int upperLimit,StringBuilder builder){
        for(;lowerLimit<=upperLimit;lowerLimit++){
            if(isPrime(lowerLimit))
                builder.append(" ").append(lowerLimit);
        }
    }

    public void printOutPrimeNumbers(){
        if (primeNums.toString().isEmpty())
            System.out.println("No prime numbers");
        else
            System.out.println(primeNums.toString());
    }

    @Override
    public boolean isPrime(int number) {

        int i=2;
        while (i<=number/2){
            if(number%i==0)
                return false;
            i++;

        }
        return true;
    }
}
