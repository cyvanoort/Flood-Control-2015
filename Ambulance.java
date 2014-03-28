import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ambulance extends Interventies
{
    public void act() 
    {
        // Get a reference to the mouse info
        MouseInfo m = Greenfoot.getMouseInfo();

        // If the mouse in in a valid location...
        if (m != null)
        {
            // Check if the mouse was dragged over this object
            if (Greenfoot.mouseDragged (this))
            {
                // if so, use MouseInfo object to set new location
                this.setLocation (m.getX(), m.getY());
            }

            else if (Greenfoot.mouseDragEnded(this))
            {
                // at the end of a drag, do nothing. This prevents
                // the mouse-clicked code below from executing
                if(foundBotsing()) {
                    eatBotsing();
                }
            }

            // Check if the mouse was clicked on the building
            else if (Greenfoot.mouseClicked (this))
            {
                // Check which button is being pressed (1 = left click, 2 = right click)
                // and rotate in one direction or the other
                //if (m.getButton() == 1)
                //ambulance.turn (12);
            }
        }
    }

    private boolean foundBotsing()
    {
        Actor botsing = getOneIntersectingObject(Botsing.class);
        if(botsing != null) {
            return true;
        }
        else {
            return false;
        }
    }

    private void eatBotsing()
    {
        Actor botsing = getOneIntersectingObject(Botsing.class);
        if(botsing!= null) {
            getWorld().removeObject(botsing);
            this.setLocation (580,725);
            Score.ScoreInt++;
            AantalBotsing.AantalBotsingInt--;
        }
    }    
}
