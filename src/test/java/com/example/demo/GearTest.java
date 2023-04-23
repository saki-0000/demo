package com.example.demo;

import com.example.demo.domain.model.Gear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GearTest {
    @Test
    public void testRatio() {
        Gear gear = new Gear(52, 11);
        assertEquals(4.7272727272727275, gear.ratio());
    }
}
