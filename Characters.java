import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Characters extends Game1
{  
    public int movement;
    public String char_left;
    public String char_right;
    public String char_up;
    public String char_down;
    protected int bagType;
    protected int keySpace;

    public void move()
    {

        if (Greenfoot.isKeyDown("left")) { moveChar(-1,0,char_left); }
        else if (Greenfoot.isKeyDown("right")) { moveChar(1,0,char_right);  }
        else if (Greenfoot.isKeyDown("up")) { moveChar(0,-1,char_up);  }
        else if (Greenfoot.isKeyDown("down")) { moveChar(0,1,char_down); }
        else if (Greenfoot.isKeyDown("space")) { moveBag(); }
        else if (!Greenfoot.isKeyDown("space")) { keySpace=0; }

    }

    public void moveChar(int dx,int dy, String direction) {
        if(getOneObjectAtOffset(dx,dy,null) != null && getOneObjectAtOffset(dx,dy,Piles.class) == null ) {
            setLocation(getX() + dx, getY() + dy);
            setImage(direction);
        }

    }

    public void moveBag() {
        int x = getX();
        int y = getY();
        if (keySpace != 1) {
            switch (bagType) {
                case 1:
                getWorld().addObject(new objKarton(), x, y);
                bagType = 0;
                break;
                case 2:
                getWorld().addObject(new objPapier(), x, y);
                bagType = 0;
                break;
                case 3:
                getWorld().addObject(new objZand(), x, y);
                bagType = 0;
                break;
                case 4:
                getWorld().addObject(new objGrindzak(), x, y);
                bagType = 0;
                break;
                case 5:
                getWorld().addObject(new objCement(), x, y);
                bagType = 0;
                break;
                default:
                if (getObjectsInRange(3,pileKarton.class).size() != 0) { bagType = 1; AnObj.aKarton--;}
                else if (getObjectsInRange(3,pilePapier.class).size() != 0) { bagType = 2; AnObj.aPapier--; }
                else if (getObjectsInRange(3,pileZand.class).size() != 0) { bagType = 3; AnObj.aZand--; }
                else if (getObjectsInRange(3,pileGrind.class).size() != 0) {  bagType = 4; AnObj.aGrind--; }
                else if (getObjectsInRange(3,pileCement.class).size() != 0) { bagType = 5; AnObj.aCement--; } 
                break;

            }
            keySpace = 1;

        }
    }
}