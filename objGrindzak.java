import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class objGrindzak extends Objects
{
    int lifetime = 200;

    public void act() 
    {
        // Counts down from 200 to 0 and will then remove the object
        lifetime--;
        if (lifetime == 0) {
            getWorld().removeObject(this);
        }
    }    
}
