import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Zand extends AnObj
{

    public void act() 
    {
        if (AnObj.aZand>0){
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("aantal zand: " + AnObj.aZand, 1, 10);   
            setImage(img);
        }
        if (AnObj.aZand==0){
            getWorld().removeObject(this);
        }
    }    
}
