import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Star extends Powerups
{
    private int count=0;
    public static boolean star=false;
    public static int life;
    public static int startlife;
    private boolean i;
    public void act() 
    {
        life();
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
            Star.star=true;
            Star.life=startlife;
        }
    }

    public void life(){
        if (i==false){
            if (Char.starp==0){
                life=5;
                startlife=5;
                i=true;
            }
            if (Char.starp==1){
                life=8;
                startlife=8;
                i=true;
            }
        }

    }
}
