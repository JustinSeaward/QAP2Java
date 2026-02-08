package Problem3;

import Problem2.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        topLeft = new MyPoint(x1,y1);
        bottomRight = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = new MyPoint(topLeft);
        this.bottomRight = new MyPoint(bottomRight);
    }

    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public void setWidth(int width){
        int newBottomRightX = topLeft.getX() + width;
        this.bottomRight.setX(newBottomRightX);
    }

    public int getLength(){
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public void setLength(int length){
        int newBottomRightY = topLeft.getY() + length;
        this.bottomRight.setY(newBottomRightY);
    }

    public double getArea(){
        double width = getWidth();
        double length = getLength();
        return width * length;
    }

    public double getPerimeter(){
        double width = getWidth();
        double length = getLength();
        return 2 * (width+length);
    }

    public String toString(){
        return("MyRectangle[Width = " + this.getWidth() + " , Length = " + this.getLength() + "]");
    }
}
