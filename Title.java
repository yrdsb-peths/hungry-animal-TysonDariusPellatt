import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    Label titleLable =new Label("Hungry Quest",75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLable, getWidth()/2, getHeight()/2);

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,500,64);
        elephant.setLocation(193,73);
        apple apple = new apple();
        addObject(apple,317,74);
        Label L2 = new Label("Press SPACE to Start",40);
        addObject(L2,400,300);
        L2.setLocation(272,284);
    }
}
