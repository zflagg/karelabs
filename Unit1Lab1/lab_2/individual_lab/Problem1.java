package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        setBackRow();
        setBackMiddleRow();
        setFrontMiddleRow();
        setFrontRow();
        reposition();
    }
    
    public void setBackRow() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        putBeeper();
        putPin();
        putPin();
        putPin();
        turnRight();
        move();
        turnRight();
    }
    
    public void setBackMiddleRow() {
        move();
        putBeeper();
        putPin();
        putPin();
        turnLeft();
        move();
        turnLeft();
    }
    
    public void setFrontMiddleRow() {
        move();
        putBeeper();
        putPin();
        turnRight();
        move();
        turnRight();
    }
    
    public void setFrontRow() {
        move();
        putBeeper();
    }
    public void reposition() {
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void putPin() {
        move();
        move();
        putBeeper();
    }
    
}
