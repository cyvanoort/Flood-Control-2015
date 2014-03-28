import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AantalPlunderaar extends Teller
{
    protected static  int AantalPlunderaarInt;      //Sets AantalPlunderaar to an integer
    public AantalPlunderaar()
    {
        GreenfootImage img = new GreenfootImage (180,30);
        img.drawString ("Aantal Plunderaars: 0", 2, 20);
        setImage(img);
    }

    public void act() 
    {
        String AantalPlunderaarString = String.valueOf(AantalPlunderaarInt);
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Aantal Plunderaars: " + AantalPlunderaarString,2,20);
        setImage(img); 
    }    
}
