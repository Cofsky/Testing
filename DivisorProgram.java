
/**
 * Write a description of class DivisorProgram here.
 *
 * @author Dylan Cofsky
 * @version September 4, 2020
 */
public class DivisorProgram
{
    public static void main (String [] args)
    {
        System.out.println("This program identifies if an integer is divisible by an input value");
        
        boolean result = isDivisor(64, 32); 
        System.out.println("the fact that 32 goes evenly into 64 is " + result);
        boolean result2 = isDivisor(13, 32);
        System.out.println("the fact that 32 divided 13 has a remainder is " + result2);
        boolean result3 = isDivisor(24, 24);
        System.out.println("24 divided by 24 has a remainder. the previous statement is "+ result3);
        boolean result4 = isDivisor(60, 30);
        System.out.println("the fact that 60/30 has a remainder is " + result4);
        boolean result5 = isDivisor(10, 5);
        System.out.println("the fact that 10/5 has a remainder is " + result5);

    }

    public static boolean isDivisor (int number, int divisor)
    {
        int remainder = (number%divisor);
        return remainder ==0;

    }
}
