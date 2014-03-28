import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends Settings
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){                     
            stopGeluid();
            reset();
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Menu());            
        }
    }

    //Resets the counters from controlecenter
    private void reset()
    {
        AantalBrand.AantalBrandInt = 0;
        AantalOverstroming.AantalOverstromingInt = 0;
        AantalPlunderaar.AantalPlunderaarInt = 0;
        AantalBotsing.AantalBotsingInt = 0;
        AantalEvacuatie.AantalEvacuatieInt= 0;
        Score.ScoreInt=0;
    }

    private void stopGeluid()
    {
        if ((Greenfoot.mouseClicked(this)==true)){
            if (Geluid == true){
                switch(World){
                    case 0:
                    achtergrondSound0.stop();
                    break;
                    case 1:
                    achtergrondSound1.stop();
                    break;
                    case 2:
                    achtergrondSound2.stop();
                    break;
                    case 3:
                    achtergrondSound3.stop();
                    break;

                }
            }
        }
    }
}
