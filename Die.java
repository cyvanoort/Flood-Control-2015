import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Die extends Game4
{

    private int die=0;
    public void act() 
    {
        die++;
        if (die == 100)
        {
            getWorld().removeObject(this);

        }

    }     
}
