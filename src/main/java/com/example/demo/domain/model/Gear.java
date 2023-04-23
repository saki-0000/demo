package com.example.demo.domain.model;

/**
 * Gearクラス
 *
 * 歯のある2つのスプロケット間の比を計算する
 * →単一責任になっていない＝タイヤやリムまで持っている！
 */
public class Gear {
    private final double chaining;
    private final double cog;
    private final double rim;
    private final double tire;

    public Gear(double chaining, double cog, double rim, double tire) {
        this.chaining = chaining;
        this.cog = cog;
        this.rim = rim;
        this.tire = tire;
    }

    public double ratio() {
        return this.chaining/ this.cog;
    }

    private double chokkei() {
        return this.rim + (this.tire * 2);
    }

    public double gearInch() {
        return this.chokkei() * this.ratio();
    }
}
