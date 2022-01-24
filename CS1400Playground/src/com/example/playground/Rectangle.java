package com.example.playground;

public class Rectangle {

    // MARK: - Properties

    private double width;
    private double length;

    // MARK: - Constructor

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // MARK: - Getters

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return (this.width * this.length);
    }

    // MARK: - Setters

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
