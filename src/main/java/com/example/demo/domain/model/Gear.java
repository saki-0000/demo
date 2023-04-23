package com.example.demo.domain.model;

public class Gear {
    private final double chainring;
    private final double cog;

    public Gear(double chainring, double cog) {
        this.chainring = chainring;
        this.cog = cog;

    }

    public Object ratio() {
        return this.chainring/ this.cog;
    }
}
