import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Evacuatie extends Calamiteiten
{
    public void act() 
    {
        timer ++;       //Adds +1 to timer every act
        if (foundWater()==true){            //Adds -1 to AantalEvacuatieInt when foundWater() is true
            AantalEvacuatie.AantalEvacuatieInt--;
        }
        else {
            controlcenter.c=5;
            controlcenter.d=1;
        }
        if(timer == 0)                 //When timer is 00, the image will be set to "auto0.PNG"
            setImage("escape0.png");
        if(timer == 20)                 //When timer is 20, the image will be set to "auto1.PNG"
            setImage("escape1.PNG");
        if(timer == 40)                 //When timer is 40, the image will be set to "auto2.PNG"
            setImage("escape2.PNG");
        if(timer == 60)                 //When timer is 60, the image will be set to "auto3.PNG"
            setImage("escape3.PNG");
        if(timer == 80)                 //When timer is 80, the image will be set to "auto2.PNG"
            setImage("escape2.PNG");
        if(timer == 100)                 //When timer is 100, the image will be set to "auto1.PNG" and timer will be set back to 0
        {
            setImage("escape1.PNG");
            timer = 0;
        }
    }    
}
