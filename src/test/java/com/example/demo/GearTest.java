package com.example.demo;

import com.example.demo.domain.model.Gear;
import com.example.demo.domain.model.Wheel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GearTest {
    @Test
    public void testRatio() {
        Wheel wheel = new Wheel(26, 1.5);
        Gear gear = new Gear(52, 11, wheel);
        assertEquals(4.7272727272727275, gear.ratio());
    }

    @Test
    public void testGearInch() {
        Wheel wheel = new Wheel(26, 1.5);
        Gear gear = new Gear(52, 11, wheel);
        assertEquals(137.0909090909091, gear.gearInch());
    }
}
