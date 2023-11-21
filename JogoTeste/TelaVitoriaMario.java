import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaVitoriaMario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TelaVitoriaMario extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class TelaVitoriaMario.
     * 
     */
    public TelaVitoriaMario()
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
