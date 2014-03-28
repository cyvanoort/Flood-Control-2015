import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class objKarton extends Objects
{

    int lifetime = 50;

    public void act() 
    {
        // Counts down from 50 to 0 and will then remove the object
        lifetime--;
        if (lifetime == 0) {
            getWorld().removeObject(this);
        }

    }    

}
