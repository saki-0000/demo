package com.example.bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {
    @Test
    public void testRatio() {
        MountainBike mountainBike = new MountainBike("S", "manitou", "Fox");
        assertEquals("chain: '10-speed', tire_size: '2.1', rear_shock:Fox", mountainBike.spares());
    }
}
