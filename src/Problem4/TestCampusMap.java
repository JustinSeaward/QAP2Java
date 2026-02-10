package Problem4;

import Problem3.MyRectangle;

public class TestCampusMap {
    public static void main(String[]Args){
        // Initializing CampusMap object
        CampusMap myCampus = new CampusMap();

        // Initializing building objects for the campus.
        MyRectangle scienceHall = new MyRectangle(-100,-50,100,-150);
        MyRectangle library = new MyRectangle(-150, 200, 150,400);
        MyRectangle lectureRoom1 = new MyRectangle(200,200,250,100);
        MyRectangle lectureRoom2 = new MyRectangle(100,100,150,0);
        MyRectangle lectureRoom3 = new MyRectangle(0,0,-50,100);
        MyRectangle lectureRoom4 = new MyRectangle(-100,-100,-150,-200);
        MyRectangle lectureRoom5 = new MyRectangle(-200,-200,-150,-300);

        // Room not added to map to check for error.
        MyRectangle lectureRoom6 = new MyRectangle(-300,-300,-250,-400);

        // Initializing a fountain object for the campus.
        MyCircle fountain = new MyCircle(50,50,10);

        // Adding buildings to the buildings array.
        myCampus.addBuilding(scienceHall);
        myCampus.addBuilding(library);
        myCampus.addBuilding(lectureRoom1);
        myCampus.addBuilding(lectureRoom2);
        myCampus.addBuilding(lectureRoom3);
        myCampus.addBuilding(lectureRoom4);
        myCampus.addBuilding(lectureRoom5);

        // Added fountain to fountain array.
        myCampus.addFountain(fountain);

        // Adding walkways to the walkways array.
        myCampus.addWalkWay(scienceHall,library);
        myCampus.addWalkWay(library,lectureRoom1);
        myCampus.addWalkWay(lectureRoom1,lectureRoom2);
        myCampus.addWalkWay(lectureRoom2,lectureRoom3);
        myCampus.addWalkWay(lectureRoom3,lectureRoom4);
        myCampus.addWalkWay(lectureRoom4,lectureRoom5);
        myCampus.addWalkWay(lectureRoom5,scienceHall);

        // Checking if there is walkways between buildings
        System.out.println("Walkway between lecture Room 5 and the science hall: " + myCampus.isWalkwayFromTo(lectureRoom5,lectureRoom4));
        System.out.println("Walkway between lecture Room 5 and the lecture room 6: " + myCampus.isWalkwayFromTo(lectureRoom5,lectureRoom6));

        // Checking if a building is in the array to add a walkway, will throw an error if it's not added to the building array.
//        myCampus.addWalkWay(lectureRoom5,lectureRoom6);

        // Stored sum of total walkway length.
        double totalWalkway = myCampus.calculateTotalWalkwayLength();
        System.out.printf("Total length of campus walkways: %.2f", totalWalkway);
        System.out.println();

        // Stored sum of total fountain area.
        double fountainArea = myCampus.calculateTotalFountainArea();
        System.out.printf("Total fountain area: %.2f ", fountainArea);
        System.out.println();


//        System.out.println("Science hall: " + scienceHall);
//        System.out.println("Library: " + library);
//        System.out.println("Lecture Room 1: " + lectureRoom1);
//        System.out.println("Lecture Room 2: " + lectureRoom2);
//        System.out.println("Lecture Room 3: " + lectureRoom3);
//        System.out.println("Lecture Room 4: " + lectureRoom4);
//        System.out.println("Lecture Room 5: " + lectureRoom5);

    }
}
