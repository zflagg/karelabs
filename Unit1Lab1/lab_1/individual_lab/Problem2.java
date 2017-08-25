package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        findCenter();
        topCircle();
        bottomCircle();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void findCenter() {
        turnLeft();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    
    public void topCircle() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
    
    public void bottomCircle() {
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    
}