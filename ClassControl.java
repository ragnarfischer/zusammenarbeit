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
     * Die Methode ruft readInput() auf
     */
    public void demoScannerAtWork()
    {
        System.out.println("Schreiben Sie etwas:");
        System.out.println(readInput());
        
    }
    
    /**
     * Methode mit Beispiel für die Nutzung des Scanners in Java
     */
    public String readInput()
    {
        return scan.nextLine();
        
    }
}
