import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int actCount;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.addObject(new Flower(), 300, 200);
        this.addObject(new McBee(), 50, 200);
        this.actCount = 0;
    }
    public void act()
    {
        this.actCount++;
        System.out.println(actCount);
        if (this.actCount%120 == 0 | this.actCount%60 ==0 ) 
        {
            int x = Greenfoot.getRandomNumber(601);
            int y = Greenfoot.getRandomNumber(401);
            this.addObject(new Flower(), x, y);
        }
    }
}
