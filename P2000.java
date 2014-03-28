import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.text.*;

public class P2000 extends Game2
{

    public static String date = "a";
    public void act() 
    {
        if(controlcenter.c==0){
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(" Geen meldingen", 25, 20);
            setImage(img); 
        }
        else if(controlcenter.c==1){
            main();
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(date + " BAW BRW Rotterdam", 25, 20);
            setImage(img); 
        }
        else if(controlcenter.c==2){
            main();
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(date + " BAW AMBU Rotterdam", 25, 20);
            setImage(img);  
        }
        else if(controlcenter.c==3){
            main();
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(date + " BAW AE Rotterdam", 25, 20);
            setImage(img);  
        }
        else if(controlcenter.c==4){
            main();
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(date + " BAW BWR Rotterdam", 25, 20);
            setImage(img);  
        }
        else if(controlcenter.c==5){
            main();
            GreenfootImage img = new GreenfootImage(300,30);
            img.drawString(date + " BAW HTT Rotterdam", 25, 20);
            setImage(img);  
        }
    }    

    private void main() {
        if (controlcenter.d==1){
            Date dNow = new Date( );
            SimpleDateFormat ft = 
                new SimpleDateFormat ("HH:mm:ss dd.MM.yyyy");

            date = (ft.format(dNow));
            controlcenter.d=0;
        }
    }
}
