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
    public int level = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        int delayTimer = 0;
        Elephant P1 = new Elephant();
        addObject(P1,300,350);
        addObject(ScoreLabel,20,20);
        spawnFruit();
    }
    public void spawnFruit()
    {
        apple or1 = new apple();
        or1.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(150);
        addObject(or1, x, y);
    }
    public void increaseScore()
    {
        score++;
        ScoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    public void gameOver()
    {
        Label gameOverLable = new Label("Game Over!",100);
        addObject(gameOverLable, 300, 200);
        Greenfoot.stop();
    }
}


