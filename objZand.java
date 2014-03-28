import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class objZand extends Objects
{
    int lifetime = 100;

    public void act() 
    {
        // Counts down from 100 to 0 and will then remove the object
        lifetime--;
        if (lifetime == 0) {
            getWorld().removeObject(this);
        }
    }    
}
