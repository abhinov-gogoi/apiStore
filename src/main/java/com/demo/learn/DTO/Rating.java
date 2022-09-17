package com.demo.learn.DTO;

public class Rating {

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Rating() {
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Rating(double rate, long count) {
        this.rate = rate;
        this.count = count;
    }

    private double rate;
    private long count;
}
