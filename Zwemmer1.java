import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zwemmer1 extends Deelnemers
{
    int timer = 0;

    public void act() 
    {   
        foundLand();
        drown();
        if (timerstatus == 0) {

            timer ++;
            if(timer == 0)
                setImage("Zwem2.png");
            if(timer == 20)
                setImage("Zwem2b.png");
            if(timer == 40)
            {
                setImage("Zwem2.png");
                timer = 0;
            }
        }    
    }
}
