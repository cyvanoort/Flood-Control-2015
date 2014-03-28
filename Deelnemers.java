import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Deelnemers extends Game4
{
    private int tijd = 0;
    protected int timerstatus = 0;
    private int drownTimer = 0;
    public void act() 
    {
        drown();
        foundLand();
    }

    public void drown()
    {   
        if(Roeiboot.hitUpgrade2 ==true)
        {
            if (tijd >=1000){
                tijd = tijd-1000;
            }
            timerstatus = 0;
        }

        if (tijd >= 1500) {
            if (tijd >= 1800) {
                timerstatus = 0;
                tijd++;
                if (tijd == 1900) {
                    timerstatus = 1;
                    getWorld().removeObject(this);
                    Drenkelingenteller.DrenkelingentellerInt=Drenkelingenteller.DrenkelingentellerInt+1;
                    if (Settings.Geluid == true) {
                        Greenfoot.playSound("Drawn.wav");
                    }
                }
            } else if (tijd % 90 == 0) {
                timerstatus = 0;
                drownTimer++;
                if (drownTimer % 20 == 0) {
                    tijd++;
                }
            } else if (tijd % 30 == 0) {
                setImage("plons2.png");
                timerstatus = 1;
                tijd++;
            } else if (tijd % 20 == 0) {
                setImage("plons1.png");
                timerstatus = 1;
                tijd++;
            } else if (tijd % 10 == 0) {
                setImage("plons0.png");
                timerstatus = 1;
                tijd++;
            } 
            else 
            { 
                tijd++; 
            }
        } else 
        { 
            tijd++; 
        }

    }

    protected boolean foundLand()
    { Actor deelnemers = getOneIntersectingObject(Land.class);
        if(deelnemers!=null) {
            getWorld().removeObject(this);
            return true;
        } else {
            return false;
        }

    }
}
