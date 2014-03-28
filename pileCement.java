import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pileCement extends Piles
{

    public void act() 
    {
        if (AnObj.aCement == 0) {
            getWorld().removeObject(this);
        }
    }    
}
