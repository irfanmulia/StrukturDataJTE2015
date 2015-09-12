
/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Komodo implements Tumbuhan
{
    String suara;
    boolean berbuah;
    
    public String suara(){
        suara = "Bip";
        return suara;
    }
    public boolean berbuah(){
        berbuah = true;
        return berbuah;
    }
}
