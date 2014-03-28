import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Verhaallijn extends Actor
{
    public static int i=0;
    public Verhaallijn(){
        image();
        i=0;
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)==true){
            getWorld().removeObject(this);
            i=1;
        }
    }    

    private void image()
    {
        switch(Settings.World){
            case 4: setImage("storyline 1.jpg");
            break;
            case 0: setImage("storyline 2.jpg");
            break;
            case 1: setImage("storyline 3.jpg");
            break;
            case 2: setImage("storyline 4.jpg");
            break;
            case 3: setImage("storyline 5.jpg");
            break;
        }
    }
}

