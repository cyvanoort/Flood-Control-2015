import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Runworld extends World
{
    private static final GreenfootImage bgImage = new GreenfootImage("Naamloos.png");
    private static final int scrollSpeed = 8;
    private GreenfootImage scrollingImage;
    private int scrollPosition = 0;
    public int teller;
    boolean run = false;
    public static int i;
    public Runworld()
    {
        super(1000, 500, 1); 
        Settings.World = 2;
            GreenfootImage background = new GreenfootImage(1000, 500);
            scrollingImage = getScrollingImage(1000, 500);
            background.drawImage(scrollingImage, 0, 0);
            setBackground(background);
            gen();
            Cont1.die=5;
            Cont.die=5;
            Star.star=false;
            Star.life=0;
            Star.startlife=0;
            Char.boost = 0;
            Char.wack = 0;
            Char.starp = 0;
            Runner.power=false;
            Runner.wrack=false;
            Starp.power=false;
            Starp.wrack=false;
            Charamen.chare=0;
            Obstacle.speed = -4;
        
    }

    public void act()
    {
        if(run=true){
            if(scrollSpeed > 0 && scrollPosition <= 0) {
                scrollPosition = getWidth();
            }
            if(scrollSpeed < 0 && scrollPosition >= getWidth()) {
                scrollPosition = 0;
            }
            scrollPosition -= scrollSpeed;
            paint(scrollPosition);
            spaw();
        }
    }

    /**
     * Paint scrolling image at given position and make sure the rest of
     * the background is also painted with the same image.
     */
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(scrollingImage, position, 0);
        bg.drawImage(scrollingImage, position - scrollingImage.getWidth(), 0);
    }

    /**
     * Returns an image with the given dimensions.
     */
    private GreenfootImage getScrollingImage(int width, int height)
    {
        GreenfootImage image = new GreenfootImage(width, height);
        for(int x = 0; x < width; x += bgImage.getWidth()) {
            for(int y = 0; y < height; y += bgImage.getHeight()) {
                image.drawImage(bgImage, x, y);
            }
        }
        return image;
    }

    public void spaw() 
    {teller++;
        if (teller==100){

            int x = 1000;
            int y = Greenfoot.getRandomNumber(500) + 20;
            int z = Greenfoot.getRandomNumber(5);
            switch(z){
                case 0:addObject(new Car(),x,y);
                break;

                case 1:addObject(new Sprint(),x,y);
                break;

                case 2:addObject(new Hole(),x,y);
                break;

                case 3:addObject(new Police(),x,100);
                addObject(new Police(),x,200);
                addObject(new Police(),x,300);
                addObject(new Police(),x,400);
                break;

                case 4:addObject(new Star(),x,y);
                break;
            }
            teller = 0;    
        }    
    }

    public void gen(){
        setPaintOrder
        (Charamen.class, Runner.class, Bigwave.class,Characters.class, Obstacle.class, Powerups.class, Sea.class);
        addObject(new Charamen(),500,250);
        addObject(new Run(),255,255);
        addObject(new Sta(),555,255);
        addObject(new Bigwave(),75,50);
        addObject(new Bigwave(),75,150);
        addObject(new Bigwave(),75,250);
        addObject(new Bigwave(),75,350);
        addObject(new Bigwave(),75,450);
        addObject(new Cont(),800,250);
        addObject(new Cont1(),900,250);
        addObject(new Cont1(),1000,250);
        addObject(new Sea(),35,250);
        addObject(new MainMenu(),950,439);
        addObject(new ResetButton(),949,475);

    }

}
