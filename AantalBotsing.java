import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AantalBotsing extends Teller
{
    protected static  int AantalBotsingInt;
    public AantalBotsing()
    {
        GreenfootImage img = new GreenfootImage (180,30);
        img.drawString ("Aantal Botsingen: 0", 2, 20);
        setImage(img);
    }

    public void act() 
    {
        String AantalBotsingString = String.valueOf(AantalBotsingInt);
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Aantal Botsingen: " + AantalBotsingString,2,20);
        setImage(img); 
    }    
}
