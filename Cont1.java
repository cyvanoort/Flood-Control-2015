import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Cont1 extends Game3
{

    public static int die=5;
    public void act() 
    {
        if (die==0)
        {
            Game_Over gameover = new Game_Over();
            getWorld().addObject(gameover,650,400);
        }
        if (getOneIntersectingObject(Char.class) != null)
        {
            setImage(new GreenfootImage("Gewonnen!", 25, Color.BLACK, Color.WHITE));  
            Greenfoot.stop();
        }
    }       
}
