import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootImage[] idleR = new GreenfootImage[5];
    GreenfootImage[] idleL = new GreenfootImage[5];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elephant()
    {
        for(int i = 0; i < idleR.length; i++)
        {
            idleR[i] = new GreenfootImage("images/Ele/tile00"+ i +".png");
            idleR[i].scale(60,60);
        }
        for(int i = 0; i < idleL.length; i++)
        {
            idleL[i] = new GreenfootImage("images/Ele/tile00"+ i +".png");
            idleL[i].mirrorHorizontally();
            idleL[i].scale(60,60);
        }
        animationTimer.mark();
        // Inital sprite
        setImage(idleR[0]);
    }
    int imageIndex = 0;
    public void animate()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleR[imageIndex]);
            imageIndex = (imageIndex + 1) % idleR.length;
        }
        else
        {
            setImage(idleL[imageIndex]);
            imageIndex = (imageIndex + 1) % idleL.length;
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            move(5);
        }
        eat();
        animate();
    }
    public void eat()
    {
         if(isTouching(apple.class)){
            removeTouching(apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnFruit();
        }
    }
}

