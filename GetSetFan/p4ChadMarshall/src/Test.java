
public class Test
{
    
    public static void main(String [] args)
    {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setOn(true);
        f1.setColor("yellow");
        System.out.println(f1.toString()); //testin da speed
        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setOn(false);
        f2.setColor("blue");
        System.out.println(" ");
        System.out.println(f2.toString()); //testin da speed
    }
   
    
}
