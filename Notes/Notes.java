
public class Notes
{
   public static void main(String[] args){
       
       int coin= (int) (Math.random()*2);
       
       
       
       
       if (coin==1){
           System.out.println("Coin is heads");
        }
       
       if (coin==0){
           System.out.println("Coin is tails");
           System.out.println("Better luck next time");
       
        }
       
       
    }
}