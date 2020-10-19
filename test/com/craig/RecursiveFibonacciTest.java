package com.craig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFibonacciTest {

    @Test
    void getFibonacci() {
        assertEquals(3,RecursiveFibonacci.getInstance().getFibonacci(4));
    }
}