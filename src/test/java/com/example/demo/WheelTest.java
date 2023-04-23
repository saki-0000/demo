package com.example.demo;

import com.example.demo.domain.model.Wheel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WheelTest {
    @Test
    public void testDiameter() {
        Wheel gear = new Wheel(26, 1.5);
        assertEquals(29.0, gear.diameter());
    }

    @Test
    public void testCircumference() {
        Wheel gear = new Wheel(26, 1.5);
        assertEquals(91.106186954104, gear.circumference());
    }
}
