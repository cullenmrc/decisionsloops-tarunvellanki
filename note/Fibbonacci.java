
import java.util.Scanner;
public class Fibbonacci
{
   public static void main(String[] args)
   {
       System.out.println("What is n?(integer)");
       Scanner in= new Scanner(System.in);
       int n= in.nextInt();
       int fNum=0;
       int firstNum= 1;
//        for (int counter=0; counter<n-1; counter++)
//        {
//            firstNum= firstNum+fNum;
//            
//            
//            
//         }
       for (int counter=1; counter<n-2; counter++)
       {
           firstNum= firstNum+fNum;
           fNum= firstNum+fNum;
           
           
           
        }
        firstNum= firstNum+fNum;
        System.out.println(firstNum+fNum);
       
    }
}
