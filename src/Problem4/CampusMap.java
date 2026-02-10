package Problem4;

// Imported classes
import java.util.ArrayList;
import Problem3.MyRectangle;
import Problem2.MyLine;
import Problem2.MyPoint;

public class CampusMap {

    // Instance variables
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<MyCircle> fountains;

    // Non  parameterized Constructor
    public CampusMap(){
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    // Method to add buildings to array
    public void addBuilding(MyRectangle newBuilding){
       buildings.add(newBuilding);
    }

    // Method to add walkway between buildings if they are in the buildings array
    public void addWalkWay(MyRectangle from, MyRectangle to){
        // if statement to determine if the buildings are in the array with an add walkway
        if(buildings.contains(from) && buildings.contains(to)){
            int fromRectangleCenterX = (from.getTopLeftX() + from.getBottomRightX()) / 2;
            int fromRectangleCenterY = (from.getTopLeftY() + from.getBottomRightY()) / 2;
            int toRectangleCenterX = (to.getTopLeftX() + to.getBottomRightX()) / 2;
            int toRectangleCenterY = (to.getTopLeftY() + to.getBottomRightY()) / 2;

            MyPoint fromPoint = new MyPoint(fromRectangleCenterX,fromRectangleCenterY);
            MyPoint toPoint = new MyPoint(toRectangleCenterX,toRectangleCenterY);
            MyLine newWalkway = new MyLine(fromPoint,toPoint);
            walkways.add(newWalkway);
        } else{
            System.out.println("Error: Building(s) is not on the map");
        }
    }

    // Add fountains to array
    public void addFountain(MyCircle newFountain){
        fountains.add(newFountain);
    }

    // Calculate total length of walkways on the map
    public double calculateTotalWalkwayLength(){
        double totalLength = 0.0;

        for(int i = 0; i < walkways.size();i++){
            totalLength = walkways.get(i).getLength() + totalLength;
        }
        return totalLength;
    }

    // Calculate total area of the fountain(s)
    public double calculateTotalFountainArea(){
        double totalArea = 0.0;

        for(int i = 0; i < fountains.size();i++){
            totalArea = fountains.get(i).getArea() + totalArea;
        }
        return totalArea;
    }

    // Method returns true if there is a walkway between two buildings or false if there isn't a walkway
    public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding){
        if(buildings.contains(fromBuilding) && buildings.contains(toBuilding)){
            int fromRectangleCenterX = (fromBuilding.getTopLeftX() + fromBuilding.getBottomRightX()) / 2;
            int fromRectangleCenterY = (fromBuilding.getTopLeftY() + fromBuilding.getBottomRightY()) / 2;
            int toRectangleCenterX = (toBuilding.getTopLeftX() + toBuilding.getBottomRightX()) / 2;
            int toRectangleCenterY = (toBuilding.getTopLeftY() + toBuilding.getBottomRightY()) / 2;
            MyPoint fromPoint = new MyPoint(fromRectangleCenterX,fromRectangleCenterY);
            MyPoint toPoint = new MyPoint(toRectangleCenterX,toRectangleCenterY);

            for(int i = 0; i < walkways.size(); i++){
                MyPoint pointA = walkways.get(i).getBegin();
                MyPoint pointB = walkways.get(i).getEnd();
                if(pointA.getX() == fromPoint.getX() &&
                        pointA.getY() == fromPoint.getY() &&
                        pointB.getX() == toPoint.getX() &&
                        pointB.getY() == toPoint.getY()
                || pointA.getX() == toPoint.getX() &&
                        pointA.getY() == toPoint.getY() &&
                        pointB.getX() == fromPoint.getX() &&
                        pointB.getY() == fromPoint.getY())
                {
                 return true;
                }
            }
        }
        return false;
    }
}
