import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bigwave extends Game3
{
    int timer = 0;
    public void act() 
    {
        timer ++;           //Adds +1 to timer every act
        Actor inter = getOneIntersectingObject(Runner.class);
        Actor inter1 = getOneIntersectingObject(Obstacle.class);
        Actor inter2 = getOneIntersectingObject(Powerups.class);
        if (inter != null || inter1 != null || inter2 != null){
            World world;
            world = getWorld();
            world.removeObject(inter);
            world.removeObject(inter1);
            world.removeObject(inter2);
        }
        if(timer == 5)                 //When timer is 20, the image will be set to "Bandito0.PNG"
            setImage("bwave0.PNG");
        if(timer == 10)                 //When timer is 40, the image will be set to "Bandito1.PNG"
            setImage("bwave1.PNG");
        if(timer == 15)                //When timer is 100, the image will be set to "Bandito0.PNG"
            setImage("bwave2.PNG");
        if(timer == 20)                //When timer is 130, the image will be set to "Bandito2.PNG"
            setImage("bwave3.PNG");
        if(timer == 25)                 //When timer is 20, the image will be set to "Bandito0.PNG"
            setImage("bwave2.PNG");
        if(timer == 30)                 //When timer is 40, the image will be set to "Bandito1.PNG"
            setImage("bwave3.PNG");
        if(timer == 35)                //When timer is 100, the image will be set to "Bandito0.PNG"
            setImage("bwave2.PNG");
        if(timer == 40)                //When timer is 130, the image will be set to "Bandito2.PNG"
            setImage("bwave1.PNG");
        if(timer == 45)                //When timer is 190, the image will be set to "Bandito0.PNG" and the timer will be set back to 0
        {
            setImage("bwave0.PNG");
            timer = 0;
        }
    }

}
