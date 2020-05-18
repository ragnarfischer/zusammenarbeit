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
        System.out.println("Welches Modul wollen Sie nutzen?");
        System.out.println(readString());
        System.out.println("Welches Zahl wollen Sie verwenden?");
        System.out.println(readString()); // Das geht auch besser!
    }
    
    /**
     * Methode mit Beispiel für die Nutzung des Scanners in Java
     * Hinweis:
     * Es gibt auch eine Methode in der Scanner-API, die Integers einliest.
     */
    public String readString()
    {
        return scan.nextLine();
        
    }
}
