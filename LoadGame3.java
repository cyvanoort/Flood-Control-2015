import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LoadGame3 extends Game3
{

    //Will load game 1
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){
            getWorld().removeObject(this);
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound4.stop();
                }
            Greenfoot.setWorld(new Runworld());

        }
    }

}
