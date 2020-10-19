package com.craig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringCheckTest {

    @Test
    void isReverse() {
        assertTrue(ReverseStringCheck.getInstance().isReverse("abc","cba"));
        assertFalse(ReverseStringCheck.getInstance().isReverse("abc","xyz"));
    }

}