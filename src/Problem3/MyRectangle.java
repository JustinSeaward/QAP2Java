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
}
