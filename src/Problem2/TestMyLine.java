package Problem2;
import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args){

        // New lines created
        MyLine line1 = new MyLine(5,5,10,10);
        MyLine line2 = new MyLine(new MyPoint(3,4),new MyPoint(8,9));

        // Testing getBegin() and getEnd() method for line1
        System.out.println("Beginning of line 1: " + line1.getBegin());
        System.out.println("End of line 1: " + line1.getEnd());
        System.out.println("Setting new points:");

        // Testing setBeginXY() and setEndXY() methods for line1
        line1.setBeginXY(7,4);
        line1.setEndXY(2,9);
        System.out.println("Beginning of line 1: " + line1.getBegin());
        System.out.println("End of line 1: " + line1.getEnd());
        System.out.println();

        // Testing toString() method for line2
        System.out.println("Line2: " + line2);

        // Testing getLength() and getGradient() methods for line2
        System.out.printf("Length of line2: %.3f", line2.getLength());
        System.out.println();
        System.out.printf("Gradient of line2: %.3f", line2.getGradient());
        System.out.println("\n");

        // Testing other getter and setter methods
        line2.setBegin(new MyPoint(10,10));
        line2.setEnd(new MyPoint(5,5));
        System.out.println("Line2: " + line2);
        System.out.println("Beginning X: " + line2.getBeginX());
        System.out.println("Beginning Y: " + line2.getBeginY());
        System.out.println("End X: " + line2.getEndX());
        System.out.println("End Y: " + line2.getEndY());
        System.out.println();

        System.out.println("Set new points for line2");
        line2.setBeginX(12);
        line2.setBeginY(20);
        line2.setEndX(1);
        line2.setEndY(9);
        System.out.println("Beginning new point: " + Arrays.toString(line2.getBeginXY()));
        System.out.println("End new point: " + Arrays.toString(line2.getEndXY()));



    }

}
