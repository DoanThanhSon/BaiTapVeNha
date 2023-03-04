package baitapoop;

public class Rectangle extends Geometric {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height, String color, String filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return 1;
    }

    public double getPerimeter() {
        return 1;
    }
    double tinhCV(double width,double height){
        double CV=(width+height)*2;
        return CV;
    }
}
