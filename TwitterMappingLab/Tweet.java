import twitter4j.*;
import java.util.Date;
import java.util.Scanner;
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
    public Tweet(String user, String text,Date date, twitter4j.GeoLocation location)
    {
        this.user= user;
        this.text= text;
        this.date=date;
        this.location=location;
        this.calculateSentiment(this.text);
    }
    public String getUser()
    {
        return user;
    }
    public String getText()
    {
        return text;
    }
    public Date getDate()
    {
        return date;
    }
    public twitter4j.GeoLocation getLocation()
    {
        return location;
    }
    public double getSentiment()
    {
        return sentiment;
    }
    public static double calculateSentiment(String text)
    {
        Scanner scan= new Scanner(System.in);
        SentimentDictionary dict= SentimentDictionary.getSingleton();
        String newString;
        double sentiment= 0.0;
        int counter=0;
        while(scan.hasNext()==true)
        {
            newString= scan.next();
            if ((dict.getSentiment(newString)!= null)){
            sentiment+= dict.getSentiment(newString);
            counter++;
        }
       }
       sentiment= sentiment/counter;
       return sentiment;
        }
    }

