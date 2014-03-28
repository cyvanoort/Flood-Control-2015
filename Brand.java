import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Brand extends Calamiteiten
{
    public void act() 
    {
        timer++;            //Adds +1 to timer every act
        if (foundWater()==true){        //Adds -1 to AantalBrandInt when foundWater() is true
            AantalBrand.AantalBrandInt--;
        }
        else {
            controlcenter.c=1;
            controlcenter.d=1;
        }
        if(timer == 0)                        //When timer is 105, the image will be set to "vlam0.png"
            setImage("vlam0.png");
        if(timer == 25)                        //When timer is 105, the image will be set to "vlam1.png"
            setImage("vlam1.PNG");
        if(timer == 50)                        //When timer is 105, the image will be set to "vlam2.png"
            setImage("vlam2.png");
        if(timer == 80)                        //When timer is 105, the image will be set to "vlam1.png"
            setImage("vlam1.PNG");
        if(timer == 105)                       //When timer is 105, the image will be set to "vlam0.png" and timer will be set back to 0
        {
            setImage("vlam0.png");
            timer = 0;
        }
    }    
}
