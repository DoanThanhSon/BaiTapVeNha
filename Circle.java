package baitapoop;

public class Circle extends Geometric {
    private double radious;

    public Circle() {

    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, String color, String filled) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return this.radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return 1;
    }

    public double getPerimeter() {
        return 1;
    }

    public double getDiameter() {
        return 1;
    }

    double chuViCircle(String color, String filled, double radious,) {
        double CV = radious * 2 * 3, 14;
        return CV;
    }

}
