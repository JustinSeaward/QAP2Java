package Problem3;

import Problem2.MyPoint;

public class TestMyRectangle {
    public static void main (String[] args){

        // Rectangle objects
        MyRectangle rec1 = new MyRectangle(4,5,8,8);
        MyRectangle rec2 = new MyRectangle(new MyPoint(6,9), new MyPoint(3,15));
        System.out.println();
        // Print out of the two rectangles values.
        System.out.println("Rectangle 1: " + rec1);
        System.out.println("Rectangle 2: " + rec2);
        System.out.println();
        // Area and perimeter of Rectangle1
        System.out.println("Rectangle 1 Area: " + rec1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + rec1.getPerimeter());
        System.out.println();
        // Setting length and width of rectangle2
        System.out.println("Setting width and length of rectangle 2");
        rec2.setWidth(6);
        rec2.setLength(10);
        System.out.println("Rectangle 2: " + rec2);
        // Area and perimeter of Rectangle2
        System.out.println("Rectangle 2 Area: " + rec2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rec2.getPerimeter());
        System.out.println("Center width of rectangle 1: " + (rec1.getTopLeftX() + rec1.getBottomRightX()) / 2);
        System.out.println("Center length of rectangle 1: " + (rec1.getTopLeftY() + rec1.getBottomRightY()) / 2);
    }
}
