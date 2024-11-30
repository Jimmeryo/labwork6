package com.lab111.labwork6.element;
import com.lab111.labwork6.visitor.NetworkVisitor;

public class Cable implements NetworkElement {
    private double length;
    private double pricePerMeter;

    public Cable(double length, double pricePerMeter) {
        this.length = length;
        this.pricePerMeter = pricePerMeter;
    }

    @Override
    public void accept(NetworkVisitor visitor) {
        visitor.visit(this);
    }

    // Getters
    public double getLength() { return length; }
    public double getPricePerMeter() { return pricePerMeter; }
}