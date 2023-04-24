package com.example.bike;

public class RoadBike {
    private final double size;
    private final String tapeColor;

    public RoadBike(double size, String tapeColor) {
        this.size = size;
        this.tapeColor = tapeColor;
    }

    public String spares() {
        return "chain: '10-speed', tire_size: '23', tape_color:" + this.tapeColor;
    }
}
