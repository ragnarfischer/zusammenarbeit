import java.util.Scanner;

/**
 * Write a description of class ClassControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassControl
{
    // instance variables - replace the example below with your own
    private Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class ClassControl
     */
    public ClassControl()
    {
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void frageSchreibe()
    {
        System.out.println("Schreiben Sie etwas:");
        System.out.println(readInput());
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String readInput()
    {
        return scan.nextLine();
        
    }
}
