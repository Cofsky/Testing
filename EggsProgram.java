
/**
 * Write a description of class EggsProgram here.
 *
 * @author Dylan Cofsky
 * @version September 10, 2020
 */
public class EggsProgram
{
   public static void main (String [] args)
   {
       calculateEggs(1400);
       calculateEggs(1342);
       
   }
    
    public static void calculateEggs (int numEggs)
    {
        
        int gross = numEggs/144;
        int grossLeftover = numEggs%144;
        int dozen = grossLeftover/12;
        int remainingEggs = grossLeftover%12;
        
        System.out.println("gross " + gross);
        System.out.println("dozen " + dozen);
        System.out.println("remaining eggs " + remainingEggs);
        
        
    }
}
