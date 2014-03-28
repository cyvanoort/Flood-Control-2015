import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LoadGame2 extends Game2
{

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){        //When clicked by mouse, the current world will be removed and controlcenter world will be spawned
            getWorld().removeObject(this);
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound4.stop();
                }
            Greenfoot.setWorld(new controlcenter());
        }
    }    
}
