import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pilePapier extends Piles
{

    public void act() 
    {
        if (AnObj.aPapier == 0) {
            getWorld().removeObject(this);
        }
    }    
}
