import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class objPapier extends Objects
{

    int lifetime = 25; 

    public void act() 
    {
        // Counts down from 25 to 0 and will then remove the object
        lifetime--;
        if (lifetime == 0) {
            getWorld().removeObject(this);
        }
    }    
}
