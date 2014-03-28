import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Politie extends Characters
{
    public Politie(){
        super.char_left = "pol-left.png";
        super.char_right = "pol-right.png";
        super.char_up = "pol-back.png";
        super.char_down = "pol-front.png";
    }

    public void act() 
    {
        move();
    }  

}
