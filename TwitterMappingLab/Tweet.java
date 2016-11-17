import twitter4j.*;
import java.util.Date;
/**
 * Write a description of class Tweet here.
 * 
 * @author Tarun Vellanki 
 * @version 11-14-16
 */
public class Tweet
{
    
    private String user;
    private String text;
    private double sentiment;
    private Date date;
    private twitter4j.GeoLocation location;
    public Tweet(String user, String text,Date date, twitter.GeoLocation location)
    {
        
    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }
   
}
