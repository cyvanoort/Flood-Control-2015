import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AantalBrand extends Teller
{
    protected static  int AantalBrandInt;
    public AantalBrand()
    {
        GreenfootImage img = new GreenfootImage (180,30);
        img.drawString ("Aantal Branden: 0", 2, 20);
        setImage(img);
    }

    public void act() 
    {
        String AantalBrandString = String.valueOf(AantalBrandInt);
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Aantal Branden: " + AantalBrandString,2,20);
        setImage(img); 
    }    
}
