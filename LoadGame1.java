import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LoadGame1 extends Game1
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){
            getWorld().removeObject(this);
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound4.stop();
                }
            floodWorld.choose=0;
            floodWorld.chare=1;
            Greenfoot.setWorld(new floodWorld());
        }
    }

}
