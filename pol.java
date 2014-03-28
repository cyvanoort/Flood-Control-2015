import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pol extends charmen
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){         //Checks if it has been clicked
            floodWorld.chare=3;                         //Changes "chare" to 3 in the world floodWorld
            floodWorld.choose=1;                        //Changes "choose" to 1 in the world floodWorld
            Greenfoot.setWorld(new floodWorld());       //Sets the World to run to the one given
            getWorld().removeObject(this);                //Removes the character menu from the world
        }
    }    
}
