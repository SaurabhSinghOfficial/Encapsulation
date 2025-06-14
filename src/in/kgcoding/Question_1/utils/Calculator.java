package in.kgcoding.Question_1.utils;

import in.kgcoding.Question_1.geometry.Circle;
import in.kgcoding.Question_1.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(5,10);


        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.length*rect.width;

        System.out.printf("Area of circle is : %f , and Area of Rectangle is : %f",cirArea, rectArea);
    }
}
