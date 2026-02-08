package Problem2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = new MyPoint(begin);
        this.end = new MyPoint(end);
    }

    public MyPoint getBegin() {
        return new MyPoint(this.begin);
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return new MyPoint(this.end);
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public int[] getBeginXY(){
        int[] a = new int[2];
        a[0] = this.begin.getX();
        a[1] = this.begin.getY();
        return a;
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }

    public int[] getEndXY(){
        int[] b = new int[2];
        b[0] = this.end.getX();
        b[1] = this.end.getY();
        return b;
    }

    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        int xDiff =  end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return(Math.atan2(yDiff,xDiff));
    }

    public String toString(){
        return("MyLine[begin=" + this.begin + ",end=" + this.end + "]");
    }
}
