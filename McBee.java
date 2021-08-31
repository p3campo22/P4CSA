import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class McBee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class McBee extends Actor
{
    /**
     * Act - do whatever the McBee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   
   private int lives;
   private int score;
   private int speed;
   public McBee()
    {
        this.speed = 5;
        this.score = 0;
        this.lives = 5;
    }
   public void moveAround()
    {
        /*if (Greenfoot.isKeyDown("up")&Greenfoot.isKeyDown("right"))
        {
            this.setRotation(315);// this actually works but clifford said no
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("up")&Greenfoot.isKeyDown("left"))
        {
            this.setRotation(235);
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("down")&Greenfoot.isKeyDown("right"))
        {
            this.setRotation(45);
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("down")&Greenfoot.isKeyDown("left"))
        {
            this.setRotation(125);
            this.move(this.speed);
        }
        else */
        if (Greenfoot.isKeyDown("up"))
        {
            this.setRotation(270);
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            this.setRotation(90);
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            this.setRotation(0);
            this.move(this.speed);
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            this.setRotation(180);
            this.move(this.speed);
        }
    }
   public void act()
    {
        this.moveAround();
        World i = this.getWorld();
        if (this.isTouching(Flower.class))
        {
            this.removeTouching(Flower.class);
            this.score += 50;
            i.showText("Score = " + score, 300, 50);
        }

    }

}