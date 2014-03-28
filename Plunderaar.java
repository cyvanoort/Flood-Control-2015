import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Plunderaar extends Calamiteiten
{
    public void act() 
    {
        timer ++;       //Adds +1 every act
        if (foundWater()==true) {        //Adds -1 to AantalPlunderaarInt when foundWater() is true
            AantalPlunderaar.AantalPlunderaarInt--;
        }
        else {
            controlcenter.c=3;          
            controlcenter.d=1;          
        }
        if(timer == 20)                 //When timer is 20, the image will be set to "Bandito0.PNG"
            setImage("Bandito0.PNG");
        if(timer == 40)                 //When timer is 40, the image will be set to "Bandito1.PNG"
            setImage("Bandito1.PNG");
        if(timer == 100)                //When timer is 100, the image will be set to "Bandito0.PNG"
            setImage("Bandito0.PNG");
        if(timer == 130)                //When timer is 130, the image will be set to "Bandito2.PNG"
            setImage("Bandito2.PNG");
        if(timer == 190)                //When timer is 190, the image will be set to "Bandito0.PNG" and the timer will be set back to 0
        {
            setImage("Bandito0.PNG");
            timer = 0;
        }
    }    

}