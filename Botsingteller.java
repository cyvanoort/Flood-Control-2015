import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Botsingteller extends Game4
{

    public static int BotsingInt;
    public Botsingteller()
    {
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Botsingen: 0",2,20);
        setImage(img); 
    }

    public void act() 
    {
        String BotsingString = String.valueOf(BotsingInt);
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Botsingen: " + BotsingString,2,20);
        setImage(img);
    } 
}

