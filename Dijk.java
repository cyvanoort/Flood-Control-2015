import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Dijk extends Game1
{

    int difficulty = 500;
    int i = 0;
    public Dijk()
    {

    }

    public void act() 
    {
        i++;
        if (i % 100 == 0) { difficulty = difficulty - 10; }
        int number = Greenfoot.getRandomNumber(difficulty);
        int destroy = 0;
        if (number == 1){ 
            if(getOneObjectAtOffset(0,-1,Dijk.class) == null  
            && getOneObjectAtOffset(0,0,objPapier.class) == null 
            && getOneObjectAtOffset(0,0,objZand.class) == null 
            && getOneObjectAtOffset(0,0,objCement.class) == null
            && getOneObjectAtOffset(0,0,objKarton.class) == null
            && getOneObjectAtOffset(0,0,objGrindzak.class) == null)
            {               
                if (getOneObjectAtOffset(0,1,Weiland.class) != null) {
                    Game_Over game_over = new Game_Over();
                    getWorld().addObject(game_over,40,40);

                }

                destroy = 1;
            }
            if (getOneObjectAtOffset(1,0,Dijk.class) == null || getOneObjectAtOffset(-1,0,Dijk.class) == null) {
                if (getOneObjectAtOffset(1,1,objPapier.class) != null 
                || getOneObjectAtOffset(1,1,objZand.class) != null 
                || getOneObjectAtOffset(1,1,objCement.class) != null
                || getOneObjectAtOffset(1,1,objKarton.class) != null
                || getOneObjectAtOffset(1,1,objGrindzak.class) != null
                || getOneObjectAtOffset(-1,1,objPapier.class) != null 
                || getOneObjectAtOffset(-1,1,objZand.class) != null 
                || getOneObjectAtOffset(-1,1,objCement.class) != null
                || getOneObjectAtOffset(-1,1,objKarton.class) != null
                || getOneObjectAtOffset(-1,1,objGrindzak.class) != null)
                {
                    destroy = 1;
                }
            }   
            if (destroy == 1) {
                getWorld().removeObject(this);
            }

        }

    }
}
