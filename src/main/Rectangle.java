package main;

class Rectangle {
    public Rectangle() {
    }

    Point[] coordinate = new Point[4];
    int x = (int) (Math.random() * 10);
    int y = (int) (Math.random() * 10);
    int size = (int) (Math.random() * 10);

    public Rectangle(int x, int y, int size) {
        this.coordinate[0] = new Point(x, y);
        this.coordinate[1] = new Point(x + size, y);
        this.coordinate[2] = new Point(x, y + size);
        this.coordinate[3] = new Point(x + size, y + size);
    }

    public Rectangle(double v) {
    }

    public double getWidth() {
        return (this.coordinate[1].getX() - this.coordinate[0].getX());
    }

    public double getHeight() {
        return (this.coordinate[3].getY() - this.coordinate[0].getY());
    }

    public double Perimeter() {
        return (getWidth() * 4);
    }

    public double Area() {
        return Math.pow(getWidth(), 2);
    }

    public double Diagonal() {
        return (Math.pow(Math.pow((getWidth()), 2) * 2, 0.5));
    }

    public boolean isRectangle(Rectangle rectangle) {
        if (rectangle.getWidth() != rectangle.getHeight()) {
            return true;
        } else
            return false;
    }

    public void setWidth() {
    }

    public void info() {
    }
}





