import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TotaalCalamiteiten extends Teller
{
    private int TotaalCalamiteiten =  AantalEvacuatie.AantalEvacuatieInt + AantalOverstroming.AantalOverstromingInt + AantalPlunderaar.AantalPlunderaarInt + AantalBotsing.AantalBotsingInt + AantalBrand.AantalBrandInt;
    public TotaalCalamiteiten()
    {
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Totaal : 0",2,20);
        setImage(img);
    }

    public void act() 
    {  image();
        gameover();
    }

    private void image() {
        TotaalCalamiteiten =  AantalEvacuatie.AantalEvacuatieInt + AantalOverstroming.AantalOverstromingInt + AantalPlunderaar.AantalPlunderaarInt + AantalBotsing.AantalBotsingInt + AantalBrand.AantalBrandInt;
        GreenfootImage img = new GreenfootImage(180,30);
        img.drawString("Totaal : " + TotaalCalamiteiten,2,20);
        setImage(img);
    }

    private void gameover()
    {
        if(TotaalCalamiteiten==10){
            Game_Over gameover = new Game_Over();
            getWorld().addObject(gameover,650,400);
        }
    }
}
