import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Politie1 extends Interventies
{
    public void act() 
    { 
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
                    if(foundPlunderaar()) {
                        eatPlunderaar();
                    }
                    if(foundOverstroming()) {
                        eatOverstroming();
                    } 

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

    private boolean foundPlunderaar()
    {
        Actor plunderaar = getOneIntersectingObject(Plunderaar.class);
        if(plunderaar != null) {
            return true;
        }
        else {
            return false;
        }
    }

    private void eatPlunderaar()
    {
        Actor plunderaar = getOneIntersectingObject(Plunderaar.class);
        if(plunderaar!= null) {
            // eet de plunderaar
            // eet zichzelf
            // update highscore
            getWorld().removeObject(plunderaar);
            this.setLocation (460,725);
            Score.ScoreInt++;
            AantalPlunderaar.AantalPlunderaarInt--;
            //              GreenfootSound yell = new GreenfootSound("yell.wav");  
            //             yell.play();
        }
    }     

    private boolean foundOverstroming()
    {
        Actor overstroming = getOneIntersectingObject(Overstroming.class);
        if(overstroming != null) {
            return true;
        }
        else {
            return false;
        }
    }

    private void eatOverstroming()
    {
        Actor overstroming = getOneIntersectingObject(Overstroming.class);
        if(overstroming!= null) {
            // eet de overstroming
            getWorld().removeObject(overstroming);
            this.setLocation (460,725);
            Score.ScoreInt++;
            AantalOverstroming.AantalOverstromingInt--;
        }
    }
}
