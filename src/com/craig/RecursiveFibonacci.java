package com.craig;


public class RecursiveFibonacci implements Fibonacci{

    private static RecursiveFibonacci fib = null;

    private RecursiveFibonacci(){}

    public static RecursiveFibonacci getInstance(){
        if(fib==null)
            fib=new RecursiveFibonacci();
        return fib;
    }

    @Override
    public int getFibonacci(int n) {
        if (n <= 1)
            return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
