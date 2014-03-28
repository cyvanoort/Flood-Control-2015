import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Powerups extends Game3
{
    private int snelheid;
    public void act() 
    {
        drive();
    } 

    public void drive()
    {move(snelheid);
    }

    public void setSnelheid(int x)
    { snelheid = x;
    }

    public int getSnelheid()
    { return snelheid;
    }
} 