import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Cement extends AnObj
{

    public void act() 
    {
        if (AnObj.aCement>0){
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("aantal cement: " + AnObj.aCement, 1, 10);   
            setImage(img);
        }
        if (AnObj.aCement==0){
            getWorld().removeObject(this);
        }
    }    
}
