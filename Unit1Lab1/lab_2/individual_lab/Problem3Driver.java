package lab_2.individual_lab;


/**
 * Write a description of class Problem3Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(2, 3, North, 16);
        karel.hello();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/karel1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}