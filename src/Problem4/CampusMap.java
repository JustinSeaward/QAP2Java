package Problem4;

// Imported classes
import java.util.ArrayList;
import Problem3.MyRectangle;
import Problem2.MyLine;
import Problem2.MyPoint;

public class CampusMap {

    // Instance variable
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<MyCircle> fountains;

    // Constructor
    public CampusMap(){
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    // Method to add buildings to buildings array
    public void addBuilding(MyRectangle newBuilding){
       buildings.add(newBuilding);
    }

    // Method to add walkway between buildings fif they are in the buildings array
    public void addWalkWay(MyRectangle from, MyRectangle to){
        // if statement to determine if the buildings are in the buildings array which calculation to add walkway
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

    public void addFountain(MyCircle newFountain){
        fountains.add(newFountain);
    }
}
