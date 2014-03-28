import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Helicopter extends Interventies
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
                if(foundEvacuatie()) {
                    eatEvacuatie();
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

    private boolean foundEvacuatie()
    {
        Actor evacuatie = getOneIntersectingObject(Evacuatie.class);
        if(evacuatie != null) {
            return true;
        }
        else {
            return false;
        }
    }

    private void eatEvacuatie()
    {
        Actor evacuatie = getOneIntersectingObject(Evacuatie.class);
        if(evacuatie!= null) {
            getWorld().removeObject(evacuatie);
            this.setLocation (700,725);
            Score.ScoreInt++;
            AantalEvacuatie.AantalEvacuatieInt--;
        }
    }  
}
