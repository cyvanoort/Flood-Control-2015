import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Genie extends Characters
{
    public Genie(){
        super.char_left = "pro-left.png";
        super.char_right = "pro-right.png";
        super.char_up = "pro-back.png";
        super.char_down = "pro-front.png";
    }

    public void act() 
    {
        move();
    }    
}
