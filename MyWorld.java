import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
private String value;
    public int dodge = 0;
    public int score = 0;
    public Label ScoreLabel = new Label(0,60);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        int delayTimer = 0;
        Elephant P1 = new Elephant();
        addObject(P1,300,350);
        addObject(ScoreLabel,20,20);
        spawnFruit();
        //spawnEnemy();
    }
    public void spawnFruit()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(150);
        apple or1 = new apple();
        addObject(or1, x, y);
    }
    /**
    public void spawnEnemy()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(150);
        Hazard e1 = new Hazard();
        Hazard e2 = new Hazard();
        Hazard e3= new Hazard();
        addObject(e1, x, y);
        if(score >= 20)
        {
            addObject(e2, x, y);
        }
    }*/
    public void increaseScore()
    {
        score++;
        ScoreLabel.setValue(score);
    }
    public void gameOver()
    {
        Label gameOverLable = new Label("Game Over!",100);
        addObject(gameOverLable, 300, 200);
        Greenfoot.stop();
    }
}


