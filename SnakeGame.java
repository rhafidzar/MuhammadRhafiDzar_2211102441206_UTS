import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame extends World
{

    Snake greenSnake = new Snake(0,255, 0, 0);
    Counter greenCounter = new Counter();
    int count = 0;
    public SnakeGame()
    {    
        super(600, 400, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(greenSnake, 150, 300);
        addObject(greenCounter, 150, 50);
    }
    public void act()
    {
        count++;
        if(count >100) {
            addObject(new Food(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1 ));
            count = 0;
        }
    }
}
