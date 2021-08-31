import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lives;
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("flower.png");
        gfi.scale(100,100);
        this.setImage(gfi);
        this.lives = 5;
    }
    public void act()
    {
        this.turn(3);
        World i = this.getWorld();
        if(this.getRotation() == 0)
        {
            this.getWorld().removeObject(this);
        }
        if(this.getRotation() == 357)
        {
            lives--;
        }
        i.showText("Lives = " +lives, 100, 50);
    }
}
