import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Geluid extends Settings
{
    public Geluid()
    {
        if(Geluid==true){
            backgroundMusic();
        }
        setImage("Speaker_Icon.png");
    }

    public void act() 
    {
        changeGeluid();
        if (Geluid == true){
            setImage("Speaker_Icon.png");
        }
        else {
            setImage("Mute_Icon.png");
        }
    }   

    private void backgroundMusic()
    { 
        switch(World){
            case 0: 
            achtergrondSound0.playLoop();
            break;
            case 1: 
            achtergrondSound1.playLoop();
            break;
            case 2: 
            achtergrondSound2.playLoop();
            break;
            case 3: 
            achtergrondSound3.playLoop();
            break;
            case 4: 
            achtergrondSound4.playLoop();
            break;
        }
    }
    
    private void changeGeluid(){
        if ((Greenfoot.mouseClicked(this)==true)){
            if (Geluid == true){
                switch(World){
                    case 0:
                    achtergrondSound0.pause();
                    break;
                    case 1:
                    achtergrondSound1.pause();
                    break;
                    case 2:
                    achtergrondSound2.pause();
                    break;
                    case 3:
                    achtergrondSound3.pause();
                    break;
                    case 4: 
                    achtergrondSound4.pause();
                    break;
                    
                }
                Geluid = false;
            }
            else if (Geluid == false){
                switch(World){
                    case 0:
                    achtergrondSound0.playLoop();
                    break;
                    case 1:
                    achtergrondSound1.playLoop();
                    break;
                    case 2:
                    achtergrondSound2.playLoop();
                    break;
                    case 3:
                    achtergrondSound3.playLoop();
                    break;    
                    case 4: 
                    achtergrondSound4.playLoop();
                    break;
                                    }
                Geluid = true;
            }
        }
    }
}
