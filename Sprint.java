import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sprint extends Powerups
{

    public void act() 
    {
        setSnelheid(-4);
        move(getSnelheid());
        drive();
        Powerup();
    }

    private void Powerup(){
        Actor inter = getOneIntersectingObject(Char.class);
        if (inter != null){
            World world;
            world = getWorld();
            world.removeObject(this);
            Runner.power=true;
            Starp.power=true;
        }
    }
}
