import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Police extends Obstacle
{

    public void act() 
    {
        setSnelheid(Obstacle.speed);
        move(getSnelheid());
        drive();
        carwrack();
    }

    private void carwrack(){
        Actor inter = getOneIntersectingObject(Char.class);
        if (inter != null){
            World world;
            world = getWorld();
            world.removeObject(this);
            Runner.wrack=true;
            Starp.wrack=true;   
            if(Star.star==true)
            {
                Star.life=Star.life-1;
            }
        }
    } 
}
