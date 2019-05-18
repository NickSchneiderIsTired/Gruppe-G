package Blatt4.Aufgabe14.a14a;

import Blatt4.Aufgabe14.Circle;
import Blatt4.Aufgabe14.GeometricObject;
import Blatt4.Aufgabe14.Point;
import Blatt4.Aufgabe14.Rectangle;

import java.util.ArrayList;
import java.util.Random;

public class a14a {
    public static double maxArea(ArrayList<GeometricObject> list) {
        double maxArea = 0;
        for(GeometricObject element : list) {
            if(element.getArea() > maxArea) {
                maxArea = element.getArea();
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<GeometricObject> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(new Circle(r.nextInt(20) + 1,
                    new Point(r.nextInt(100), r.nextInt(100))));
        }

        for(int i = 0; i < 10; i++) {
            list.add(new Rectangle(r.nextInt(20) + 1, r.nextInt(20) + 1,
                    new Point(r.nextInt(100), r.nextInt(100))));
        }

        list.stream().forEach(System.out::println);

        System.out.println(maxArea(list));
    }

}
