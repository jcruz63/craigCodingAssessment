package com.craig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square(5);


    @Test
    void perimeter() {
        assertEquals(20,square.perimeter());
    }

    @Test
    void area() {
        assertEquals(25,square.area());
    }
}