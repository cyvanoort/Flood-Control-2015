import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LoadGame4 extends Game4
{

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){
            getWorld().removeObject(this);
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound4.stop();
                }
            Greenfoot.setWorld(new Oceanworld());
        }
    }

}
