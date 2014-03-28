import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    public int verhaallijnInt = 0;
    public Menu()
    {    
        super(1300, 800, 1);    // Create a new world with 1300x800 cells with a cell size of 1x1 pixels.
        Greenfoot.start();
        Settings.World = 4;
        verhaallijnInt=0;
        generate();

    }

    private void generate()
    {
        setPaintOrder (Verhaallijn.class);
        addObject(new Verhaallijn(),650,400);
        addObject(new LoadGame1(),352,251);
        addObject(new LoadGame2(),951,251);
        addObject(new LoadGame3(),352,552);
        addObject(new LoadGame4(),951,552); 
        Geluid geluid = new Geluid();
        addObject(geluid ,1192,47);
    }

    private void Verhaallijn()
    {
        switch (verhaallijnInt)
        {
            case 0 : addObject(new Verhaallijn(),650,400);
            verhaallijnInt++;
            break;

        }
    }
}
