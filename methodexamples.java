
/**
 * Write a description of class methodexamples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class methodexamples
{
    public static void sayHi5Times ()
    {
        //String hi = "Hi";
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
    }
    // define method to compute the average of 3 inputs
    public static double computeAverage (int num1, int num2, int num3)
    {
        double average = (num1 + num2 + num3) / 3.0;

        return average;
    }

    public static void main (String [] args)
    {
        // call to a method!
        // say hi 10 times!
        //sayHi5Times();
        //sayHi5Times();

        // example call to computeAverage
        double result = computeAverage(80, 80, 90);
        System.out.println("The average of 80, 80, 90 is " + result);
        //test this out, use computeAverage for any 3 numbers of your choice
        double result2 = computeAverage(26, 13, 31);
        System.out.println("The average of 26, 13, 31 is " + result2);

        boolean modResult = 10%2 ==0;
        System.out.println(modResult);

    }
}
