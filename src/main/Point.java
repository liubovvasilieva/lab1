package main;

public class Point {
    private int x, y;
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
     public int getY () {
        return y;
     }
     @Override
    public String toString() {
        return "X:" + this.getX() + " " + "Y:" + this.getY();
    }
    void Show() {
        System.out.println("Coordinates are: ");
    }
}
