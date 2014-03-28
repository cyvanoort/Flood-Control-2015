import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Papier extends AnObj
{

    public void act() 
    {
        if (AnObj.aPapier>0){
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("aantal papier: " + AnObj.aPapier, 1, 10);   
            setImage(img);
        }
        if (AnObj.aPapier==0){
            getWorld().removeObject(this);
        }
    }    
}
