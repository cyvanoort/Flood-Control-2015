import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Overstroming extends Calamiteiten
{

    public void act() 
    {
        timer ++;           //Adds +1 to timer every act
        if (foundWater()==true){            //Adds -1 to AantalOverstromingInt when foundWater() is true
            AantalOverstroming.AantalOverstromingInt--;
        }
        else {
            controlcenter.c=4;
            controlcenter.d=1;
        }
        if(timer == 0)                        //When timer is 0, the image will be set to "wave0.png"
            setImage("wave0.png");
        if(timer == 30)                       //When timer is 30, the image will be set to "wave1.PNG"
            setImage("wave1.PNG");
        if(timer == 60)                       //When timer is 60, the image will be set to "wave2.PNG"
            setImage("wave2.PNG");
        if(timer == 90)                       //When timer is 90, the image will be set to "wave3.PNG"
            setImage("wave3.PNG");
        if(timer == 120)                      //When timer is 120, the image will be set to "wave4.PNG" and timer will be set back to 0
        {
            setImage("wave4.PNG");
            timer = 0;
        }
    } 
}
