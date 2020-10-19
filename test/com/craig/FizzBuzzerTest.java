package com.craig;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzerTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void doFizzBuzz() {
        FizzBuzzer.getInstance().doFizzBuzz();
        assertEquals("1"+"\r\n"+"2"+"\r\n"+"3"+"\r\n"+"4"+"\r\n"+"5"+"\r\n"+"Fizz"+"\r\n"+"7"+"\r\n"+"8"+"\r\n"+"9"+"\r\n"+"Buzz"
                ,outputStream.toString().substring(0,34));
    }

    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
    }


}