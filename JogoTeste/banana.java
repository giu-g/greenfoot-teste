import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends Actor
{
    private int temp = 50;
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    
    public void acertarAlvo(){
        
        Actor a = getOneIntersectingObject(Mario.class);
        
        if (a != null){
            
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
            
                getWorld().removeObject(a);
                getWorld().removeObject(this);
                
                temp = 0;
                
                if (temp < 1) {
                    TelaVitoriaLuigi world = new TelaVitoriaLuigi();
                    Greenfoot.setWorld(world);
                }
                
        }
    }
    
        public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x, y);
    }
}
