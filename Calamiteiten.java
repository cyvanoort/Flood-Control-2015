import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Calamiteiten extends Game2
{
    public int timer = 0;       //sets timer to 0
    public void act() 
    { 

    }

    public boolean foundWater()     //Checks if a calamiteit has spawned inside the waterblock objects and will then remove the calamiteit when it has spawned within intersecting range
    { Actor w = getOneIntersectingObject(waterblock.class);
        if(w!=null) {
            getWorld().removeObject(this);
            return true;
        } else {
            return false;
        }
    }
}
