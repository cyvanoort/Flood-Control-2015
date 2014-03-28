import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pileGrind extends Piles
{

    public void act() 
    {
        if (AnObj.aGrind == 0) {
            getWorld().removeObject(this);
        }
    }    
}
