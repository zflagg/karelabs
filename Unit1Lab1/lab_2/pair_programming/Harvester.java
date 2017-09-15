package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void plant() {
        repositionEnd();
        plantTwoRows();
        plantTwoRows();
        plantTwoRows();
    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    //your methods go below
    /**
     * Precondition: Robot facing East, one block away from a row of beepers
     * Postcondition: Robot facing East, two blocks above where it started, one block away from a beeper
     */
    
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    
    public void harvestOneRow() {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void repositionEnd() {
        turnRight();
        move();
        turnLeft();
    }
    
    public void plantTwoRows() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    
}

