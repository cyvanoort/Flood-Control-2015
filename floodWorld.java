import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class floodWorld extends World
{
    protected static int choose=0;
    protected static int chare=0;
    public floodWorld()
    {    
        // Create a new world with 80x80 cells with a cell size of 10x10 pixels.
        super(80, 80, 10); 
        //Sets the background cells to the image "water.png"
        setBackground("water.png");

        //Sets the integer for the world to zero
        Settings.World = 0;
        //Generates the all the objects for the game
        if (choose==1){
            generateWeiland();
            generateDijk();
            generate();
        }

        //Generates the character menu
        if (choose==0){
            setPaintOrder(Verhaallijn.class);
            addObject(new Verhaallijn(), 39, 39);
            charmen charmen=new charmen();
            addObject(charmen, 39, 39);      //spawns the character menu on a fixed location
            bur bur = new bur();
            addObject(bur, 13, 40);          //spawns the character "burger" on a fixed location
            pol pol = new pol();
            addObject(pol, 39, 40);          //spawns the character "politie" on a fixed location
            pro pro = new pro();
            addObject(pro, 65, 40);          //spawns the character "genie" on a fixed location
        }
    }

    //Spawns the Weiland objects on fixed locations
    private void generateWeiland()
    {
        int y = 50;
        int z = 0;
        for(int i=0; i<2400; i++) {
            Weiland weiland = new Weiland();

            if (i  % 80 == 0) {
                z = 0;
                y = y+1;
            }

            addObject(weiland, z, y);
            z = z+1;
        }
    }

    //Spawns the Dijk objects on fixed locations
    private void generateDijk()
    {
        int y = 30;
        int z = 0;
        for(int i=0; i<1600; i++) {
            Dijk dijk = new Dijk();

            if (i % 80 == 0 ) {
                z = 0;
                y = y + 1;
            }

            addObject(dijk, z, y);
            z = z+1;
        }
    }

    //Spawns objects  on fixed locations
    private void generate()
    {
        addObject( new MainMenu(), 74, 77);                    //spawns the object "Main Menu" on a fixed location

        addObject( new Geluid(),76,69);                        //spawns the object "Geluid" on a fixed location

        addObject (new AnObj(), 10, 2);
        addObject (new Papier(), 10, 4);
        addObject (new Karton(), 10, 6);
        addObject (new Zand(), 10, 8);
        addObject (new Cement(), 10, 10);
        addObject (new Grind(), 10, 12);
        addObject (new scoreTimer(), 77, 2);
        addObject (new ResetButton(), 74, 73);

        //Spawns character that was chosen in the character menu
        if (chare==1){
            Burger burger = new Burger();
            addObject(burger, 71, 59);                      //spawns the character "burger" on a fixed location when the player has chosen "burger" in the character menu
        }
        if (chare==2){
            Genie genie = new Genie();
            addObject(genie, 71, 59);                      //spawns the character "genie" on a fixed location when the player has chosen "genie" in the character menu
        }
        if (chare==3){
            Politie politie = new Politie();
            addObject(politie, 71, 59);                    //spawns the character "politie" on a fixed location when the player has chosen "politie" in the character menu
        }
    }
}

