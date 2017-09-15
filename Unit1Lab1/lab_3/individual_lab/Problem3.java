package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        nextRoom();
        checkSurrounded();
    }
    public void checkSurrounded() {
        if (checkLeft() && checkRight() && checkTop()) {
            putBeeper();
        }
        faceSouth();
        turnLeft();
        turnLeft();
        if (frontIsClear()) {
            move();
            checkSurrounded();
        }
        else {
            faceSouth();
            move();
            turnLeft();
            carpetRooms();
        }
    }
}

