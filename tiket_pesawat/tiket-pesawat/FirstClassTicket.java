
/**
 * Write a description of class FirstClassTicket here.
 *
 * @author winda naff
 * @version 14 Nov 2024
 */
public class FirstClassTicket extends Ticket {
    public FirstClassTicket(String penumpang, double harga_dasar){
        super(penumpang, harga_dasar);
    }

    @Override
    public double hitung_harga(){
        return harga_dasar * 1.50; // untuk tambahan 50%
    }
    
}