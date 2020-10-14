
/**
 * Write a description of class competency_demo_1 here. 
 *
 * @author Dylan Cofsky
 * @version September 8, 2020
 */
public class competency_demo_1
{
   public static void main (String [] args)
   {
       int numint = 47;
       double numdub = 53.0;
       boolean numbool = 20%10 == 0;
       double mathfivehundo = (numint*5)+((numdub/2.0)*10);
       int mathfive = ((numint-42)+41)-41;
       double mathhundo = ((mathfivehundo*2)/2)/mathfive;
       System.out.println(mathhundo);
       int exvalue = Integer.MAX_VALUE;
       System.out.println("exvalue = " + exvalue);
       System.out.println("exvalue + exvalue = " + exvalue + exvalue);
   }
}
