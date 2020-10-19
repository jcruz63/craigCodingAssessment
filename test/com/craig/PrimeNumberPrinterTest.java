package com.craig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberPrinterTest {

    @Test
    void isPrime() {
        PrimeNumberPrinter primeNumberPrinter = new PrimeNumberPrinter(5);
        assertTrue(primeNumberPrinter.isPrime(5));
        assertFalse(primeNumberPrinter.isPrime(6));
    }
}