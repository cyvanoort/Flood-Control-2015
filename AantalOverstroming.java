import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AantalOverstroming extends Teller
{
    protected static int AantalOverstromingInt;
    public AantalOverstroming()
    {
        GreenfootImage img = new GreenfootImage (180,30);     
        img.drawString ("Aantal Overstromingen: 0", 2, 20);
        setImage(img);
    }

    public void act() 
    {
        String AantalOverstromingString = String.valueOf(AantalOverstromingInt);
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Aantal Overstromingen: " + AantalOverstromingString,2,20);
        setImage(img); 
    }    
}
