import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class controlcenter extends World
{
    public static int d=0;
    public static int c=0;
    private int teller = 0;
    private int difficulty = 130;
    private int speed =0;
    int i = 0;
    public controlcenter()
    {
        super(1300, 800, 1);            // Create a new world with 1300x800 cells with a cell size of 1x1 pixels.     
        Settings.World = 1;   // Sets the integer for the world to one
        setPaintOrder
        (Ambulance.class, Helicopter.class, Politie1.class, Brandweer.class, Brand.class, Overstroming.class, Plunderaar.class, Botsing.class, Evacuatie.class);
        populate();
        AantalBrand.AantalBrandInt = 0;
        AantalOverstroming.AantalOverstromingInt = 0;
        AantalPlunderaar.AantalPlunderaarInt = 0;
        AantalBotsing.AantalBotsingInt = 0;
        AantalEvacuatie.AantalEvacuatieInt= 0;
        Score.ScoreInt= 0;

    }

    public void act() 
    { 
        spawn();
        changeSpeed();
    }
    //Spawns objects  on fixed locations
    private void populate()
    {   
        P2000 P2000 = new P2000();
        addObject(P2000,652,780);

        waterMid1 waterMid = new waterMid1();
        addObject(waterMid,495,574);
        waterMid.turn (-27);

        waterLeft4 waterLeft = new waterLeft4();
        addObject(waterLeft,156,637);    

        waterLMid6 waterLMid = new waterLMid6();
        addObject(waterLMid,459,484);
        waterLMid.turn (45);

        waterRMid5 waterRMid = new waterRMid5();
        addObject(waterRMid,768,486);
        waterRMid.turn (-23);

        waterRight2 waterRight = new waterRight2();
        addObject(waterRight,1081,600);
        waterRight.turn (-17);

        waterUp3 waterUp = new waterUp3();
        addObject(waterUp,757,5);
        waterUp.turn (24);

        Score score = new Score();
        addObject(score,1260,777);

        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu,1244,752);

        ResetButton reset = new ResetButton();
        addObject(reset,1244,713);

        Politie1 po1 = new Politie1();
        addObject(po1,460,725);       

        Ambulance am1 = new Ambulance();
        addObject(am1,580,725);

        Helicopter he1 = new Helicopter();
        addObject(he1,700,725);

        Brandweer br1 = new Brandweer();
        addObject(br1,820,725);  

        AantalBotsing abo = new AantalBotsing();
        addObject (abo, 120, 680);

        AantalBrand abr = new AantalBrand();
        addObject (abr, 120, 700);

        AantalEvacuatie aev = new AantalEvacuatie();
        addObject (aev, 120, 720);

        AantalOverstroming aov = new AantalOverstroming();
        addObject (aov, 120, 740);

        AantalPlunderaar apl = new AantalPlunderaar();
        addObject (apl, 120, 760);

        TotaalCalamiteiten Totaal1 = new TotaalCalamiteiten();
        addObject (Totaal1, 120, 780);

        Geluid geluid = new Geluid();
        addObject(geluid ,1178,778);

    }
    //Spawns objects  on random locations 
    private void spawn()
    {
        teller++; 
        if (teller==difficulty){

            int x = Greenfoot.getRandomNumber(1280) + 20;
            int y = Greenfoot.getRandomNumber(620) + 20;
            int z = Greenfoot.getRandomNumber(5);
            switch(z){
                case 0:Brand a1 = new Brand(); 
                addObject(a1,x,y);
                AantalBrand.AantalBrandInt++;
                break;

                case 1:Botsing b1 = new Botsing(); 
                addObject(b1,x,y);
                AantalBotsing.AantalBotsingInt++;
                break;

                case 2:Plunderaar c1 = new Plunderaar(); 
                addObject(c1,x,y);
                AantalPlunderaar.AantalPlunderaarInt++;
                break;

                case 3:Overstroming d1 = new Overstroming(); 
                addObject(d1,x,y);              
                AantalOverstroming.AantalOverstromingInt++;
                break;

                case 4:Evacuatie e1 = new Evacuatie(); 
                addObject(e1,x,y);        
                AantalEvacuatie.AantalEvacuatieInt++;
                break;
            }
            teller = 0;    //Resets the teller
            speed++;  //increments speed
        }     
    }
    //changes the speed of which objects spawn
    private void changeSpeed ()
    {
        //         if (speed == 10)
        //         {
        //             difficulty = 100;
        //         }
        //         else if (speed == 20)
        //         {
        //             difficulty = 70;
        //         }
        //         else if (speed == 30)
        //         {
        //             difficulty = 40;
        //         }
        switch(speed){
            case 10: difficulty = 100;
            break;
            case 20: difficulty = 70;
            break;
            case 30: difficulty = 40;
            break;
            case 40: difficulty = 20;
            break;
        }
    }
}

