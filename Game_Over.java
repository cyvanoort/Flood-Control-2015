import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Game_Over extends Actor
{

    public void act() 
    {

    }   

    //Will draw game over
    public Game_Over()
    {   switch(Settings.World){
            case 0:
            setImage(new GreenfootImage("De dijk is doorgebroken, game over!!", 25, Color.BLACK, Color.WHITE));
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound0.stop();
                }
            Greenfoot.stop();
            break;

            case 1:
            setImage(new GreenfootImage("Er zijn te veel calamiteiten, game over!!", 25, Color.BLACK, Color.WHITE));
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound1.stop();
                }

            Greenfoot.stop();
            break;

            case 2:
            setImage(new GreenfootImage("Het water was sneller, game over!", 25, Color.BLACK, Color.WHITE));
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound2.stop();
                }
            
            Greenfoot.stop();
            break;

            case 3:
            setImage(new GreenfootImage("Er zijn te veel personen verdronken of overgevaren, game over!!", 25, Color.BLACK, Color.WHITE));
            if (Settings.Geluid == true) {
                    Settings.achtergrondSound3.stop();
                }
            
            Greenfoot.stop();
            break;
        }
    }
}

