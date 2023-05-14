package com.example.lab3.model;

import com.example.lab3.entities.Dot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testt {

    @Test
    void testDotProcessorSuccess() {
        Dot dot = new Dot(1.0, 1.0, 2.0);
        Assertions.assertTrue(DotProcessor.processDot(dot));
    }

    @Test
    void testDotProcessorFail() {
        Dot dot = new Dot(2.0, 2.0, 1.99);
        Assertions.assertFalse(DotProcessor.processDot(dot));
    }
}
