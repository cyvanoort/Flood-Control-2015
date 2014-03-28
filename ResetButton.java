import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ResetButton extends Settings
{

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){
            getWorld().removeObject(this);
            switch(World){
                case 0 : resetGame1();
                Greenfoot.setWorld(new floodWorld());
                break;
                case 1 : resetGame2();
                Greenfoot.setWorld(new controlcenter());
                break;
                case 2: resetGame3();
                Greenfoot.setWorld(new Runworld());
                break;
                case 3: resetGame4();
                Greenfoot.setWorld(new Oceanworld());
                break;
            }
        }
    }    
    
    
    private void resetGame1()
    {
        floodWorld.choose=0;
        floodWorld.chare=1;
    }
    
    
    private void resetGame2()
    {
        AantalBrand.AantalBrandInt = 0;
        AantalOverstroming.AantalOverstromingInt = 0;
        AantalPlunderaar.AantalPlunderaarInt = 0;
        AantalBotsing.AantalBotsingInt = 0;
        AantalEvacuatie.AantalEvacuatieInt= 0;
        Score.ScoreInt= 0;
    }

    
    private void resetGame3()
    {
        Cont1.die=5;
        Cont.die=5;
        Star.star=false;
        Star.life=0;
        Star.startlife=0;
        Char.boost = 0;
        Char.wack = 0;
        Char.starp = 0;
        Runner.power=false;
        Runner.wrack=false;
        Starp.power=false;
        Starp.wrack=false;
        Charamen.chare=0;
        Obstacle.speed = -4;
    }
    
    
    private void resetGame4()
    {
        Drenkelingenteller.DrenkelingentellerInt = 0;
        Score.ScoreInt = 0;
        Botsingteller.BotsingInt = 0;
    }
}
