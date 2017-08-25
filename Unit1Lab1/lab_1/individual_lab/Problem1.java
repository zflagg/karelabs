package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        pickBeeper1();
        putBeeper1();
        pickBeeper2();
        putBeeper2();
        pickBeeper3();
        putBeeper3();
        pickBeeper4();
        putBeeper4();
        position();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void turnLeftMoveTwo() {
        turnLeft();
        move();
        move();
    }
    
    public void turnRightMoveTwo() {
        turnRight();
        move();
        move();
    }
    
    public void pickBeeper1() {
        move();
        move();
        turnLeft();
        move();
        pickBeeper();
    }
    
    public void putBeeper1() {
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
    }
    
    public void pickBeeper2() {
        turnLeft();
        move();
        turnRight();
        move();
        pickBeeper();
    }
    
    public void putBeeper2() {
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
    }
    
    public void pickBeeper3() {
        move();
        move();
        turnLeft();
        move();
        pickBeeper();
    }
    
    public void putBeeper3() {
        move();
        move();
        turnLeftMoveTwo();
        putBeeper();
    }
    
    public void pickBeeper4() {
        move();
        move();
        turnLeftMoveTwo();
        pickBeeper();
    }
    
    public void putBeeper4() {
        move();
        move();
        turnLeftMoveTwo();
        putBeeper();
    }
    
    public void position() {
        turnRight();
        turnRightMoveTwo();
        turnRightMoveTwo();
        turnRight();
    }
    
}