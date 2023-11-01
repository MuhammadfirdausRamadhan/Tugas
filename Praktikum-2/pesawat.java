import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author semarsoft.com
 * @version 1
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        Berjalan();
    }
    
    public void Berjalan() {
        move(5);
        turn(1);
    }
    
    public void BelokKiri() {
        turn(-90);
    }
    
    public void BelokKanan() {
        turn(90);
    }
}
