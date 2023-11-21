import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaVitoriaLuigi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TelaVitoriaLuigi extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class TelaVitoriaLuigi.
     * 
     */
    public TelaVitoriaLuigi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            Creditos world = new Creditos();
            Greenfoot.setWorld(world);
        }
    }
}
