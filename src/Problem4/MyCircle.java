package Problem4;

import Problem2.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){
        this.radius = radius;
        this.center = new MyPoint(0,0);
    }
    public MyCircle(int x, int y, int radius){
        this.radius = radius;
        this.center = new MyPoint(x,y);
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public MyPoint getCenter() {
        return center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void getCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        int[] a = new int[2];
        a[0] = this.center.getX();
        a[1] = this.center.getY();
        return a;
    }

    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    public String toString(){
        return ("Center = " + this.center + " and radius = " + this.radius);
    }
    public double getArea(){
        return(this.radius * this.radius * Math.PI);
    }
    public double getCircumference(){
        return(2*Math.PI*this.radius);
    }
    public double distance(MyCircle c){
        return(this.center.distance(c.center));
    }

}
