import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Upgrades extends Game4
{
    private int tijd = 0;
    protected int timerstatus = 0;
    private int drownTimer = 0;
    public void act() 
    {
        upgradeDrown();
        foundKade();
    }

    public void upgradeDrown()
    {  
        tijd++;
        if(tijd==1000){
            getWorld().removeObject(this);
        }
    }    

    protected void foundKade()
    { Actor upgrades = getOneIntersectingObject(Land.class);
        if(upgrades!=null) {
            getWorld().removeObject(this);
        }
    }
}

