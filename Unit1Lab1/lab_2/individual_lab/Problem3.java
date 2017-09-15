package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
    
    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    

    public void hello() {
        drawH();
        repositionE();
        drawE();
        drawL();
        drawL();
        drawO();
    }
    
    public void drawColumn() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void drawH() {
        drawColumn();
        turnRight();
        move();
        move();
        move();
        turnRight();
        drawColumn();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void repositionE() {
        move();
        move();
        move();
        move();
    }
    
    public void drawE() {
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        move();
        turnRight();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void drawL() {
        
    }
    
    public void drawO() {
        
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}
