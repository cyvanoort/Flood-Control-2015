import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Oceanworld extends World
{
    int teller=0;
    public Oceanworld()
    {    
        super(1300, 800, 1);  // Create a new world with 1300x800 cells with a cell size of 1x1 pixels.
        Settings.World = 3;
        prepare();
        Drenkelingenteller.DrenkelingentellerInt = 0;
        Score.ScoreInt = 0;
        Botsingteller.BotsingInt = 0;
    }

    //Spawns objects in the world on fixed locations
    private void prepare()
    {
        Pierpaal pierpaal = new Pierpaal();
        addObject(pierpaal, 628, 785);
        Pierpaal pierpaal1 = new Pierpaal();
        addObject(pierpaal1, 672, 785);
        Pier pier= new Pier();
        addObject(pier, 681, 722);
        Pier pier1 = new Pier();
        addObject(pier1, 650, 722);
        Pier pier2 = new Pier();
        addObject(pier2, 619, 722);
        Pier pier3 = new Pier();
        addObject(pier3, 681, 754);
        Pier pier4 = new Pier();
        addObject(pier4, 650, 754);
        Pier pier5= new Pier();
        addObject(pier5, 619, 754);
        Roeiboot roeiboot = new Roeiboot();
        addObject(roeiboot, 655, 672);
        Drenkelingenteller drenkelingenteller = new Drenkelingenteller();
        addObject(drenkelingenteller, 1236, 650);
        Score s1 = new Score(); 
        addObject(s1,1236, 663);
        Botsingteller h2 = new Botsingteller();
        addObject(h2, 1236, 677);
        MainMenu mainmenu = new MainMenu();
        addObject(mainmenu, 1235, 745);
        ResetButton resetbutton = new ResetButton();
        addObject(resetbutton, 1235,780);
        Geluid geluid = new Geluid();
        addObject(geluid ,1229,708);
    }

    //Spawns objects in the world on random locations
    public void act() 
    {
        generate();
        gameover();
    }

    private void generate()
    {
        setPaintOrder( Score.class, Botsingteller.class, Land.class,Geluid.class,MainMenu.class,ResetButton.class,Roeiboot.class, Die.class, Deelnemers.class, Upgrades.class);
        teller++;
        int randomnumber = Greenfoot.getRandomNumber(2000);
        int x = Greenfoot.getRandomNumber(1280) + 10;
        int y = Greenfoot.getRandomNumber(780) + 10;
        if (teller==250){
            int z = Greenfoot.getRandomNumber(4);
            if(x>1200 && y>710){
                x = Greenfoot.getRandomNumber(1280) + 10;
                y = Greenfoot.getRandomNumber(780) + 10;  
            }
            switch(z){
                case 0:Zwemmer a1 = new Zwemmer(); 
                addObject(a1,x,y);
                break;

                case 1:Zwemmer1 d1 = new Zwemmer1(); 
                addObject(d1,x,y);
                break;

                case 2:Zwemmer2 b1 = new Zwemmer2(); 
                addObject(b1,x,y);
                break;

                case 3:Zwemmer3 c1 = new Zwemmer3(); 
                addObject(c1,x,y);              
                break;
            }
            teller = 0; 
        }
        if (randomnumber == 0)
        {   int soortUpgrade = Greenfoot.getRandomNumber(2);
            switch(soortUpgrade)
            {
                case 0:
                Upgrade1 u1 = new Upgrade1();
                addObject(u1,x,y);
                break;
                case 1:
                Upgrade2 u2 =  new Upgrade2();
                addObject(u2,x,y);
                break;
            }
        }
    }

    private void gameover(){
        if(Drenkelingenteller.DrenkelingentellerInt == 5 || Botsingteller.BotsingInt == 5){
            Game_Over gameover = new Game_Over();
            addObject(gameover,650,400);
        }
    }
}

