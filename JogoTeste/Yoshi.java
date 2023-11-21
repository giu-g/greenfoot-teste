import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yoshi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yoshi extends Actor
{
    GifImage myGif = new GifImage("yoshi.gif");
    /**
     * Act - do whatever the Yoshi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
