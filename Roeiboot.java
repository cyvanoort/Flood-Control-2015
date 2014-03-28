import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Roeiboot extends Game4
{

    private int personen=1;
    private int zwemmeroppakken;
    private int botsingen=0;
    static boolean hitUpgrade2 = false;
    private int nitrocooldown;

    public void act() 
    {
        foundZwemmer();
        foundPier();
        foundUpgrade();
        if (botsingen==0){
            botsingZwemmer();
        }
        else if(botsingen==1 && getOneIntersectingObject(Deelnemers.class) == null){
            botsingen=0;
        }
        if (nitrocooldown > 0) {
            nitrocooldown = nitrocooldown-2;
        }
    }   

    public void movein()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            move(6);
        }
        if(nitrocooldown < 1000){
            if (Greenfoot.isKeyDown("space"))
            {
                move(12);
                nitrocooldown = nitrocooldown + 50;
            }

        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }

    }

    public void movein2()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }

    }

    public void movein3()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }

    }

    public void foundZwemmer()
    {
        if(zwemmeroppakken==0){
            Actor zwemmer = getOneIntersectingObject(Deelnemers.class);
            if(zwemmer != null) {
                getWorld().removeObject(zwemmer);
                setImage("boat2.png");
                personen=2;
                zwemmeroppakken=1;
            }    
        }
        if(zwemmeroppakken==1){

        }
    }

    public void foundPier()
    {
        Actor land = getOneIntersectingObject(Land.class);                                  
        if(land != null) {
            if (personen==2){
                personen=1;
                Score.ScoreInt=Score.ScoreInt+1;
                zwemmeroppakken=0;
                if (Settings.Geluid == true) {
                    Greenfoot.playSound("punten.wav");
                }
            }
            setImage("boat1.png");
            movein3();
        }   
        else{
            if (personen==2){
                movein2();
            }
            if (personen==1){
                movein();
            }
        }                                     
    }

    public void botsingZwemmer()
    {
        Actor deelnemers = getOneIntersectingObject(Deelnemers.class);
        if(deelnemers != null && personen == 2) {
            getWorld().removeObject(deelnemers);
            int x = getX();
            int y = getY();
            Die Die = new Die();
            getWorld().addObject(Die, x, y);
            Botsingteller.BotsingInt=Botsingteller.BotsingInt+1;
            botsingen=1;
            if (Settings.Geluid == true) {
                Greenfoot.playSound("Squish.wav");
            }
        }
    }

    public void foundUpgrade()
    {
        Actor upgrade1 =  getOneIntersectingObject(Upgrade1.class);
        if(upgrade1 != null)  {
            Score.ScoreInt=Score.ScoreInt+3;
            getWorld().removeObject(upgrade1);
        }

        Actor upgrade2 = getOneIntersectingObject(Upgrade2.class);
        if(upgrade2 != null) {
            hitUpgrade2 = true;
            getWorld().removeObject(upgrade2);
        }
        else {
            hitUpgrade2 =false;
        }

    }
}

