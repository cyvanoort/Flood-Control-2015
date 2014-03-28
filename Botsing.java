import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Botsing extends Calamiteiten
{   
    public void act() 
    {
        timer ++;               //Adds +1 to timer every act
        if (foundWater()==true){            //Adds -1 to AantalBotsingInt when foundWater() is true
            AantalBotsing.AantalBotsingInt--;
        }
        else {
            controlcenter.c=2;
            controlcenter.d=1;
        }
        if(timer == 10)                 //When timer is 10, the image will be set to "auto0.PNG"
            setImage("auto0.PNG");
        if(timer == 30)                 //When timer is 30, the image will be set to "auto1.PNG"
            setImage("auto1.PNG");
        if(timer == 50)                 //When timer is 50, the image will be set to "auto2.PNG"
            setImage("auto2.PNG");
        if(timer == 70)                 //When timer is 70, the image will be set to "auto0.PNG" and timer will be set back to 0
        {
            setImage("auto2.PNG");
            timer = 0;
        }
    }    

}
