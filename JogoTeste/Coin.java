import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    private int temp = 50;
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    
    public void acertarAlvo(){
        
        Actor b = getOneIntersectingObject(Luigi.class);
        
        if (b != null){
            
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            
                getWorld().removeObject(b);
                getWorld().removeObject(this);
                
                temp = 0;
                
                if (temp < 1) {
                    TelaVitoriaMario world = new TelaVitoriaMario();
                    Greenfoot.setWorld(world);
                }
                
        }
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
}
