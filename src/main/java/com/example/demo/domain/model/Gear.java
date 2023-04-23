package com.example.demo.domain.model;

/**
 * Gearクラス
 *
 * 歯のある2つのスプロケット間の比を計算する
 */
public class Gear {
    private final double chaining;
    private final double cog;
    private final Wheel wheel;

    public Gear(double chaining, double cog, double rim, double tire) {
        this.chaining = chaining;
        this.cog = cog;
        this.wheel = new Wheel(rim, tire);
    }

    public double ratio() {
        return this.chaining/ this.cog;
    }

    public double gearInch() {
        return wheel.diameter() * this.ratio();
    }


}
