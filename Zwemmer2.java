import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zwemmer2 extends Deelnemers
{
    int timer = 0;
    public void act() 
    {   
        foundLand();
        drown();
        if (timerstatus == 0) {
            timer ++;

            if(timer == 0)
                setImage("Zwem3.png");
            if(timer == 20)
                setImage("Zwem3b.png");
            if(timer == 40)
            {
                setImage("Zwem3.png");
                timer = 0;
            }
        }
    }    
}
