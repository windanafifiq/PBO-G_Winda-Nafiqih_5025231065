
/**
 * Write a description of class EconomyTicket here.
 *
 * @author winda naff
 * @version 14 Nov 2024
 */

public class EconomyTicket extends Ticket{
    public EconomyTicket(String penumpang, double harga_dasar){
        super(penumpang, harga_dasar);
    }

    @Override
    public double hitung_harga(){
        return harga_dasar * 0.9; // untuk diskon 10%
    }
}