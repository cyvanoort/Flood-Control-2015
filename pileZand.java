import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pileZand extends Piles
{

    public void act() 
    {
        if (AnObj.aZand == 0) {
            getWorld().removeObject(this);
        }
    }    
}
