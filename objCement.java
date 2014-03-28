import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class objCement extends Objects
{
    int lifetime = 150;

    public void act() 
    {   
        // Counts down from 150 to 0 and will then remove the object
        lifetime--;
        if (lifetime == 0) {
            getWorld().removeObject(this);
        }
    }    
}
