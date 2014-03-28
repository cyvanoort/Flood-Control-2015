import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Charamen extends Game3
{

    protected static int chare=0;
    private boolean start = false;
    public void act() 
    {
        if(chare==1){
            getWorld().addObject(new Runner(), 350, 200);
            getWorld().addObject(new Geluid(),875,472);
            start = true;
        }
        if (chare==2){
            getWorld().addObject(new Starp(),350,200);
            getWorld().addObject(new Geluid(),875,472);
            start = true;
        }
        if(start==true){
            getWorld().removeObject(this);
            
        }
    }    
}
