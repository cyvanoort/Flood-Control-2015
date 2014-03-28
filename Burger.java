import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Burger extends Characters
{
    public Burger(){
        super.char_left = "civil-left.png";
        super.char_right = "civil-right.png";
        super.char_up = "civil-back.png";
        super.char_down = "civil-front.png";
    }

    public void act() 
    {
        move();
    }   
}

