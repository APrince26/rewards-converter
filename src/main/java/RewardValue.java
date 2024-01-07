package main.java;

public class RewardValue() {

    private double cash;

    private double miles;

    public RewardValue (double cash) {
        this.cash = cash / 0.0035;
    }

    public RewardValue (double miles) {
        this.miles = miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
