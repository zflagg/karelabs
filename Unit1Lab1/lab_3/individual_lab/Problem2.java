package lab_3.individual_lab;

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
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void carpetRooms(){
        nextRoom();
        checkSurrounded();
        
    }
    public void nextRoom() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void checkSurrounded() {
        if (checkLeft() && checkRight() && checkTop()) {
            putBeeper();
        }
        faceSouth();
        move();
        turnLeft();
        carpetRooms();
    }
    public boolean checkLeft() {
        faceSouth();
        turnRight();
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean checkRight() {
        faceSouth();
        turnLeft();
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean checkTop() {
        faceSouth();
        turnLeft();
        turnLeft();
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public void faceSouth() {
        if(facingWest()) {
            turnLeft();
        }
        if (facingNorth()) {
            turnLeft();
            turnLeft();
        }
        if (facingEast()) {
            turnRight();
        }
    }
    public void reposition() {
        faceSouth();
        move();
        turnLeft();
    }
}

