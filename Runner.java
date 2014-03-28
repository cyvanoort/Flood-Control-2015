import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Runner extends Char
{

    // deze character krijgt meer boosts van de sprint en minder last van kuilen
    public static boolean power=false;
    public static boolean wrack=false;
    int timer = 0;
    public void act() 
    {
        Char.boost=100;
        Char.wack=50;
        Char.starp=0;
        move();
        chara();
        sprint();
        timer ++;           //Adds +1 to timer every act
        if (Star.star==true){
            if(Star.life==0)
            {
                Star.star=false;
            }
        }
        if(Star.star==false){
            wrack();
            Star.life=Star.startlife;
        }

    }  

    private void chara()
    {
        if (Star.star==true)
        {
            if(Star.life>1){
                if(timer == 0)                        //When timer is 0, the image will be set to "starrun0.png"
                    setImage("starrun0.png");
                if(timer == 5)                       //When timer is 5, the image will be set to "starrun1.png"
                    setImage("starrun1.png");
                if(timer == 10)                       //When timer is 10, the image will be set to "starrun2.PNG"
                    setImage("starrun2.PNG");
                if(timer == 15)                       //When timer is 15, the image will be set to "starrun3.png"
                    setImage("starrun3.png");
                if(timer == 20)                        //When timer is 20, the image will be set to "starrun4.png"
                    setImage("starrun4.png");
                if(timer == 25)                       //When timer is 25, the image will be set to "starrun5.png"
                    setImage("starrun5.png");
                if(timer == 30)                       //When timer is 30, the image will be set to "starrun6.png"
                    setImage("starrun6.png");
                if(timer == 35)                       //When timer is 35, the image will be set to "starrun7.png"
                    setImage("starrun7.png");
                if(timer == 40)                        //When timer is 40, the image will be set to "starrun8.png"
                    setImage("starrun8.png");
                if(timer == 45)                      //When timer is 45, the image will be set to "starrun9.PNG" and timer will be set back to 0
                {
                    setImage("starrun9.png");
                    timer = 0;
                }
            }
            if(Star.life==1){
                if(timer == 0)                        //When timer is 0, the image will be set to "run0.png"
                    setImage("run0.png");
                if(timer == 5)                       //When timer is 5, the image will be set to "run1.png"
                    setImage("run1.png");
                if(timer == 10)                       //When timer is 10, the image will be set to "run2.png"
                    setImage("run2.PNG");
                if(timer == 15)                       //When timer is 15, the image will be set to "run3.PNG"
                    setImage("run3.PNG");
                if(timer == 20)                        //When timer is 20, the image will be set to "run4.png"
                    setImage("run4.png");
                if(timer == 25)                       //When timer is 25, the image will be set to "run5.png"
                    setImage("run5.png");
                if(timer == 30)                       //When timer is 30, the image will be set to "run6.png"
                    setImage("run6.png");
                if(timer == 35)                       //When timer is 35, the image will be set to "run7.png"
                    setImage("run7.png");
                if(timer == 40)                        //When timer is 40, the image will be set to "run8.png"
                    setImage("run8.png");
                if(timer == 45)                      //When timer is 45, the image will be set to "run9.png" and timer will be set back to 0
                {
                    setImage("run9.png");
                    timer = 0;
                }
            }
        }
        if (Star.star==false)
        {
            if(timer == 0)                        //When timer is 0, the image will be set to "run0.png"
                setImage("run0.png");
            if(timer == 5)                       //When timer is 5, the image will be set to "run1.png"
                setImage("run1.png");
            if(timer == 10)                       //When timer is 10, the image will be set to "run2.PNG"
                setImage("run2.PNG");
            if(timer == 15)                       //When timer is 15, the image will be set to "run3.png"
                setImage("run3.PNG");
            if(timer == 20)                        //When timer is 20, the image will be set to "run4.png"
                setImage("run4.png");
            if(timer == 25)                       //When timer is 25, the image will be set to "run5.png"
                setImage("run5.png");
            if(timer == 30)                       //When timer is 30, the image will be set to "run6.png"
                setImage("run6.png");
            if(timer == 35)                       //When timer is 35, the image will be set to "run7.png"
                setImage("run7.png");
            if(timer == 40)                        //When timer is 40, the image will be set to "run8.png"
                setImage("run8.png");
            if(timer == 45)                      //When timer is 45, the image will be set to "run9.png" and timer will be set back to 0
            {
                setImage("run9.png");
                timer = 0;
            }
        }
    }

    private void sprint(){
        if (power==true){
            setLocation(getX()+Char.boost, getY());
            Cont.die=Cont.die+2;
            power=false;
        }
    }

    private void wrack(){
        if (wrack==true){
            setLocation(getX()-Char.wack, getY());
            Cont.die=Cont.die-1;
            wrack=false;
        }
    }

    private void move ()
    {
        setRotation(270);
        if (Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5); 
        }
    } 
}
