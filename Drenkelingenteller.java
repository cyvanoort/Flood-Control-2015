import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Drenkelingenteller extends Game4
{
    public static int DrenkelingentellerInt;
    public Drenkelingenteller()
    {
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Drenkelingen: 0",2,20);
        setImage(img); 
    }

    public void act() 
    {
        String DrenkelingentellerString = String.valueOf(DrenkelingentellerInt);
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Drenkelingen: " + DrenkelingentellerString,2,20);
        setImage(img);
    } 
}
