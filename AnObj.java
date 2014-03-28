import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class AnObj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnObj extends Game1
{
    /**
     * Act - do whatever the AnObj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int aKarton = 0;
    public static int aPapier = 0;
    public static int aZand = 0;
    public static int aGrind = 0;
    public static int aCement = 0;
    private int initDone=0;
    public void act() 
    {
        if (initDone==0 && floodWorld.chare!=0) {

            //aantal objecten geven voor burger
            //zand
            //karton
            //papier
            if (floodWorld.chare==1)
            {
                aZand = 30;
                aKarton = 30;
                aPapier = 30;

            }
            //aantal objecten geven voor politie
            //zand
            //karton
            //papier
            //grindzakken
            //cementzakken
            if (floodWorld.chare==3)
            {
                aZand = 10;
                aKarton = 10;
                aPapier = 10;
                aGrind = 10;
                aCement = 10;

            }
            //aantal objecten geven voor genie
            //zand
            //karton
            //papier
            //grindzakken
            //cementzakken
            if (floodWorld.chare==2)
            {
                aZand = 10;
                aKarton = 10;
                aPapier = 10;
                aGrind = 5;
                aCement = 5;

            }

            if(aCement!=0){
                getWorld().addObject(new pileCement(), 5, 70);                   //spawns the object "cementzak" on a fixed location
            }
            if(aZand!=0){
                getWorld().addObject(new pileZand(), 20, 70);                    //spawns the object "zandzak" on a fixed location
            }
            if(aKarton!=0){
                getWorld().addObject(new pileKarton(), 35, 70);                  //spawns the object "kartonnen doos" on a fixed location
            }
            if (aPapier!=0){
                getWorld().addObject(new pilePapier(), 50, 70);                  //spawns the object "papieren doos" on a fixed location
            }
            if(aGrind!=0){
                getWorld().addObject(new pileGrind(), 65, 70);                   //spawns the object "grindzak" on a fixed location
            }
            GreenfootImage img = new GreenfootImage(200,30);
            img.drawString("Beschikbare materiaal:", 1, 10);   
            setImage(img);
            initDone=1;
        }    
    }
}
