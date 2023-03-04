package baitapoop;

public class Geometric {
    private String color;
    private String filled;

    public Geometric() {

    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return this.filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometric: color= " + getColor() + ", color=" + getFilled();
    }
}
