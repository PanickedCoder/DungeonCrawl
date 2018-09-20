import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Debug area to make stuff work.
 * 
 * @author JL 
 * @version jif
 */
public class TestWorld extends ActiveWorld
{
    private Counter goldcounter;
    /**
     * Constructor for objects of class TestWorld.
     * 
     */
    public TestWorld()
    {    
        // Create a new world with 10x10 cells with a cell size of 50x50 pixels.
        super(10, 10, 50); 
        setPaintOrder(Player.class, Counter.class);
        prepare();
        goldcounter = new Counter("Gold: ");
        addObject(goldcounter, 5, 9);
    }

    public Counter getCounter()
    {
        return goldcounter;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        Player player2 = new Player();
        addObject(player2,4,5);
        Wall wall = new Wall();
        addObject(wall,9,0);
        Wall wall2 = new Wall();
        addObject(wall2,8,0);
        Wall wall3 = new Wall();
        addObject(wall3,7,0);
        Wall wall4 = new Wall();
        addObject(wall4,7,1);
        Wall wall5 = new Wall();
        addObject(wall5,7,2);
        DoorClosed doorclosed3 = new DoorClosed();
        addObject(doorclosed3,7,3);
        DoorClosed doorclosed4 = new DoorClosed();
        addObject(doorclosed4,8,4);
        DoorClosed doorclosed5 = new DoorClosed();
        addObject(doorclosed5,9,5);
        DoorClosed doorclosed6 = new DoorClosed();
        addObject(doorclosed6,7,4);
        DoorClosed doorclosed7 = new DoorClosed();
        addObject(doorclosed7,8,5);
        Wall wall6 = new Wall();
        addObject(wall6,4,1);
        Wall wall7 = new Wall();
        addObject(wall7,3,2);
        Wall wall8 = new Wall();
        addObject(wall8,2,3);
        Wall wall9 = new Wall();
        addObject(wall9,2,1);
        Wall wall10 = new Wall();
        addObject(wall10,4,3);
        Wall wall11 = new Wall();
        addObject(wall11,3,4);
        Wall wall12 = new Wall();
        addObject(wall12,2,5);
        Wall wall13 = new Wall();
        addObject(wall13,1,4);
        Wall wall14 = new Wall();
        addObject(wall14,1,2);
        Gold gold = new Gold();
        addObject(gold,6,8);
        Gold gold2 = new Gold();
        addObject(gold2,6,7);
        Gold gold3 = new Gold();
        addObject(gold3,7,7);
        Gold gold4 = new Gold();
        addObject(gold4,7,8);
        Gold gold5 = new Gold();
        addObject(gold5,7,9);
        Gold gold6 = new Gold();
        addObject(gold6,6,9);
        Gold gold7 = new Gold();
        addObject(gold7,5,9);
        Gold gold8 = new Gold();
        addObject(gold8,5,8);
        Gold gold9 = new Gold();
        addObject(gold9,5,7);
    }
}
