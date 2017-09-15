package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setBottomPins();
        setTopPins();
    }
    
    public void setTopPins() {
        turnRight();
        move();
        turnRight();
        putPin();
        putPin();
        putPin();
        move();
        turnLeft();
        move();
        turnLeft();
        putPin();
        putPin();
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    
    public void setBottomPins(){
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
