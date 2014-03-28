import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pileKarton extends Piles
{

    public void act() 
    {
        if (AnObj.aKarton == 0) {
            getWorld().removeObject(this);
        }
    }    
}
