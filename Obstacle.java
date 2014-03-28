import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Game3
{
    private int snelheid;
    public static int speed = -4;
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

