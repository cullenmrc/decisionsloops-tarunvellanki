
public class State
{
    private String abbreviation;
    private twitter4j.GeoLocation center;
    private double area;
    private double sentiment;

    /**
     * Default constructor for objects of class State
     */
    public State(String abbreviation, twitter4j.GeoLocation center, double area)
    {
        // initialise instance variables
        abbreviation=this.abbreviation;
        center= this.center;
        area= this.area;
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
    public String getAbbreviation()
    {
        // put your code here
        return this.abbreviation;
    }
    public twitter4j.GeoLocation getCenter()
    {
        // put your code here
        return this.center;
    }
    public double getArea()
    {
        // put your code here
        return this.area;
    }
    public double getSentiment()
    {
        // put your code here
        return this.sentiment;
    }
    public void setSentiment()
    {
        // put your code here
        sentiment=this.sentiment;
    }
    public double getRadius()
    {
       double radiusSquared= area/Math.PI;
       double radius= Math.sqrt(radiusSquared); 
       return radius;
    }
    public String toString()
    {
        String megaString= ("Abbreviation= "+ this.abbreviation+ "\n"+
        "Center= "+ this.center+ "\n"+
        "Area= "+ this.area+ "\n"+
        "Sentiment= "+ this.sentiment+ "\n"+
        "Radius= "+ this.getRadius()+ "\n");
        return megaString;
    }
}
