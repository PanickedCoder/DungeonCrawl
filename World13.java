import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World13 extends ActiveWorld
{
    private Counter goldcounter;
    /**
     * Constructor for objects of class World13.
     * 
     */
    public World13()
    {
            super(10, 10, 50); 
        prepare();
        setPaintOrder(Player.class, Counter.class);
        goldcounter = new Counter("Gold: ");
        addObject(goldcounter, 5, 9);
    }

    public Counter getCounter()
    {
        return goldcounter;
    }
     private void prepare()
    {
    
    }
}
