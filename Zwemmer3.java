import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zwemmer3 extends Deelnemers
{
    int timer = 0;
    public void act() 
    {  
        foundLand();
        drown();
        if (timerstatus == 0) {
            timer ++;

            if(timer == 0)
                setImage("Zwem4.png");
            if(timer == 20)
                setImage("Zwem4b.png");
            if(timer == 40)
            {
                setImage("Zwem4.png");
                timer = 0;
            }
        }    
    }
}
