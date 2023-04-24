package com.example.bike;

public class MountainBike {
    private final String size;
    private final String frontShock;
    private final String rearShock;

    public MountainBike(String size, String frontShock, String rearShock) {
        this.size = size;
        this.frontShock = frontShock;
        this.rearShock = rearShock;
    }

    public String spares() {
        return "chain: '10-speed', tire_size: '2.1', rear_shock:" + this.rearShock;
    }
}
