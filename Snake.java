import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SnakeGame snakeGame = (SnakeGame) getWorld();
    int r, g, b, Snake;
    int speed = 3;
    int count = 0;
    public Snake(int Snake, int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(),getY());
        move(speed);
        moveAround();
        eatFood();
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        setRotation(0);
        if(Greenfoot.isKeyDown("left"))
        setRotation(180);
        if(Greenfoot.isKeyDown("up"))
        setRotation(270);
        if(Greenfoot.isKeyDown("down"))
        setRotation(90);
    }
    
    public void eatFood()
    {
        if(isTouching(Food.class) && Snake == 0)
        {
            SnakeGame snakeGame = (SnakeGame)getWorld();
            snakeGame.greenCounter.addScore();
        }
    }
}
