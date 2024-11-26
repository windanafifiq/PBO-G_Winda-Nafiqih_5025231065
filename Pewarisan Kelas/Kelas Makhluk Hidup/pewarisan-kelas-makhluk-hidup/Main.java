
/**
 * Write a description of class main here.
 *
 * @author winda naff
 * @version 21 Nov 2024
 */
public class Main {
    
    public static void main(String[] args) {
        makhlukHidup manusia = new Manusia();
        makhlukHidup hewan = new Hewan();
        makhlukHidup tumbuhan = new Tumbuhan();
        
        manusia.makan();  
        manusia.bergerak();
        
        hewan.makan();
        hewan.bergerak();
        
        tumbuhan.makan();
        tumbuhan.bergerak();
    }
}