
public class Fan 
{
    
    public static final int SLOW = 1;
     public static final int MEDIUM = 2;
      public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan()
    {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
     public boolean getOn()
    {
        return this.on;
    }
    public void setOn(boolean on)
    {
        this.on = on;
    }
public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String toString()
    {
        if(on == true)
        {
            return "The fan's speed is "+ this.speed + ", "
                    + "and the fan's color is " + this.color + ", "
                    + "ANNNNNNNND the radius is " + this.radius;
        }
        else
        {
            return "The fan's color is " + this.color + ", "
                    + "AND the radius is " + this.radius + " ANND the fan is off";
                    
        }  
    }
}
