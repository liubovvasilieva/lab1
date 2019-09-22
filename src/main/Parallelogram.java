package main;

import java.util.Scanner;

public class Parallelogram extends Rectangle {
    public Parallelogram () {
        Scanner scanner = new Scanner(System.in);
    }
    public Parallelogram (int x, int y, int width, int height) {
        super();

        this.coordinate[0] = new Point (x, y);
        this.coordinate[1] = new Point (x+width, y);
        this.coordinate[2] = new Point (x, y+height);
        this.coordinate[3] = new Point(x+width, y+height);
    }
    public double getWidth() {
        return(this.coordinate[1].getX() - this.coordinate[0].getX());
    }
    public double getHeight() {
        return (this.coordinate[3].getY() - this.coordinate[0].getY());
    }
    public double Perimeter() {
        return (getWidth()*2 + getHeight()*2);
    }
    public double Area() {
        return (getWidth()*getHeight());
    }
    @Override
    public double Diagonal() {
        return super.Diagonal();
    }
    public boolean isParallelogram(Parallelogram parallelogram) {
        if (parallelogram.getWidth() == parallelogram.getHeight() ) {
            return true;
        }
        else
            return false;
    }
}
