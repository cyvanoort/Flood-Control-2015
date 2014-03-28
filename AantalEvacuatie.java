import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AantalEvacuatie extends Teller
{
    protected static  int AantalEvacuatieInt;
    public AantalEvacuatie()
    {
        GreenfootImage img = new GreenfootImage (180,30);
        img.drawString ("Aantal Evacuaties: 0", 2, 20);
        setImage(img);
    }

    public void act() 
    {
        String AantalEvacuatieString = String.valueOf(AantalEvacuatieInt);
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Aantal Evacuaties: " + AantalEvacuatieString,2,20);
        setImage(img); 
    }    
}
