import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Grind extends AnObj
{

    public void act() 
    {
        if (AnObj.aGrind>0){
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("aantal grind: " + AnObj.aGrind, 1, 10);   
            setImage(img);
        }
        if (AnObj.aGrind==0){
            getWorld().removeObject(this);
        }
    }    
}
