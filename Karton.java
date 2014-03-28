import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Karton extends AnObj
{

    public void act() 
    {
        if (AnObj.aKarton>0){
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("aantal karton: " + AnObj.aKarton, 1, 10);   
            setImage(img);
        }
        if (AnObj.aKarton==0){
            getWorld().removeObject(this);
        }
    }    
}
