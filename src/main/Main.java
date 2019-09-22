package main;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(4, 2, 3);
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Area());
        System.out.println(rectangle.Diagonal());
        Parallelogram parallelogram = new Parallelogram(10, 7, 6, 6);
        System.out.println(parallelogram.Perimeter());
        System.out.println(parallelogram.Area());
        System.out.println(parallelogram.Diagonal());

        System.out.println("Enter quantity of rectangles: ");
        int quantity = scanner.nextInt();
        double [] arr = new double[quantity];

        for (int i = 0; i < quantity; i++) {
            double width;
            System.out.println("\nEnter value of the side of rectangle: ");
            rectangle = new Rectangle(width = scanner.nextDouble());
            rectangle.setWidth();
            rectangle.info();
            arr[i] = rectangle.Area();
        }

        double sum = 0;
        for (double v : arr) {
            sum = sum + v;
        }

        double average = sum/arr.length;
        System.out.println("\nAverage area: " + String.format("%6.2f",average));

    }
}
