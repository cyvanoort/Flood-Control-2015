import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{   public static int ScoreInt;
    public Score()
    {  

        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Score: 0",2,20);
        setImage(img); 
    }

    public void act() 
    {
        String ScoreString = String.valueOf(ScoreInt);
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Score: " + ScoreString,2,20);
        setImage(img); 
    }       
}