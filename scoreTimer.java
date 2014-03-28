import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class scoreTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreTimer extends Game1
{

    long startTime = 0;
    long elapsedTime = 0;
    String displayTime = "";

    public scoreTimer() {
        setImage(new GreenfootImage("0",50,Color.GREEN,Color.WHITE));
    }

    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if(startTime==0) { startTime = System.currentTimeMillis(); }
        elapsedTime = System.currentTimeMillis() - startTime;

        displayTime = "" + elapsedTime / 1000;        
        setImage(new GreenfootImage(displayTime,25,Color.GREEN,Color.WHITE));

    }    
}
