package com.example.bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
    @Test
    public void testRatio() {
        RoadBike roadBike = new RoadBike(26, "red");
        assertEquals("chain: '10-speed', tire_size: '23', tape_color:red", roadBike.spares());
    }
}
