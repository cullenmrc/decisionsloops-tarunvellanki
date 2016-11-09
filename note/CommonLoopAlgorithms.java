
import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Sum and Average
     * reads a series of numbers (ends with a letter)
     * calculates the sum and average of the numbers
     * prints the sum and average
     */
    public static void sumAndAverage()
    {
        Scanner s = new Scanner( System.in );
        double sum = 0;
        double average = 0;
        int count = 0;
        
        System.out.println( "Enter a series of numbers (any letter to quit)" );
        
        while( s.hasNextDouble())
        {
            double value = s.nextDouble();
            sum += value;
            count++;
        }
        
        if( count > 0 )
        {
            average = sum / count;
        }
        
        System.out.println( "sum: " + sum + " average: " + average );
    }
    
    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * prints the count
     * 
     * RED GROUP
     */
    public static void countMatches()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("What is the value?(Type a letter to exit)");
        String value= s.nextString();
        int amount=0;
        if(true){
        for(x=0; x<=value.length();x++){
            if (value.substring(x)=="a"){
                break;
            }
            if (value.substring(x)=="b"){
                break;
            }
            if (value.substring(x)=="c"){
                break;
            }
            if (value.substring(x)=="d"){
                break;
            }
            if (value.substring(x)=="e"){
                break;
            }
            if (value.substring(x)=="f"){
                break;
            }
            if (value.substring(x)=="g"){
                break;
            }
            if (value.substring(x)=="h"){
                break;
            }
            if (value.substring(x)=="i"){
                break;
            }
            if (value.substring(x)=="j"){
                break;
            }
            if (value.substring(x)=="k"){
                break;
            }
            if (value.substring(x)=="l"){
                break;
            }
            if (value.substring(x)=="m"){
                break;
            }
            if (value.substring(x)=="n"){
                break;
            }
            if (value.substring(x)=="o"){
                break;
            }
            if (value.substring(x)=="p"){
                break;
            }
            if (value.substring(x)=="q"){
                break;
            }
            if (value.substring(x)=="r"){
                break;
            }
            if (value.substring(x)=="s"){
                break;
            }
            if (value.substring(x)=="t"){
                break;
            }
            if (value.substring(x)=="u"){
                break;
            }
            if (value.substring(x)=="v"){
                break;
            }
            if (value.substring(x)=="w"){
                break;
            }
            if (value.substring(x)=="x"){
                break;
            }
            if (value.substring(x)=="y"){
                break;
            }
            if (value.substring(x)=="z"){
                break;
            }
        }
    }
    else{    
        int new= (int) value;
        if (new>100){
            amount++;
            System.out.println("What is the value?(Type a letter to exit)");
            int value= s.nextInt();
            }
        
        }
        System.out.println("There are ", value, " amount of numbers that are greater than 100 that you typed");
    }
    
    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * prints the number of words read before the match
     * 
     * ORANGE GROUP
     */
    public static void findFirstMatch()
    {
    }
    
    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * prints the number that matched the criteria
     * 
     * BLUE GROUP
     */
    public static void promptUntilMatch()
    {
    }
    
    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * prints the greatest number
     * 
     * PURPLE GROUP
     */
    public static void findMax()
    {
    }
    
    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * prints the least number
     * 
     * PURPLE GROUP
     */
    public static void findMin()
    {
    }
    
    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * prints a message if an adjacent duplicate number is entered and exits the loop
     * 
     * GREEN GROUP
     */
    public static void compareAdjacent()
    {
    }
    
    
}
