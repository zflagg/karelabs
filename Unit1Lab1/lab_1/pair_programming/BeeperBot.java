package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * Zach Flagg :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        moveThree();
        turnLeft();
        moveTwo();
        pickBeeper();
        moveThree();
        pickBeeper();
        moveLeft();
        pickBeeper();
        moveLeft();
        pickBeeper();
        moveTwo();
        putFourBeeper();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void moveThree() {
        move();
        move();
        move();
    }
    
    public void moveLeft() {
        turnLeft();
        moveThree();
    }
    
    public void putFourBeeper() {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
    
}

