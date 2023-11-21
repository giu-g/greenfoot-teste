import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author GGS 
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
private GreenfootSound bgMusic = new GreenfootSound("Jazz.mp3");
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Mario mario = new Mario();
        addObject(mario,160,480);
        Counter counter = new Counter();
        addObject(counter,168,33);
        Counter2 counter2 = new Counter2();
        addObject(counter2,260,6);
        counter2.setLocation(611,34);
        Luigi luigi = new Luigi();
        addObject(luigi,614,466);
        Yoshi yoshi = new Yoshi();
        addObject(yoshi,380,490);
    }

    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
    
}
