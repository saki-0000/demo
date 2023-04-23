package com.example.demo.domain.model;

/**
 * Wheelクラス
 *
 * タイアのサイズを計算する
 */
public class Wheel {
    private final double rim;
    private final double tire;

    public Wheel(double rim, double tire){

        this.rim = rim;
        this.tire = tire;
    }

    public double diameter() {
        return this.rim + (this.tire * 2);
    }

    public double circumference() {
        return this.diameter() * Math.PI;
    }
}
