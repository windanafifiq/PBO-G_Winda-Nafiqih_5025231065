
/**
 * Write a description of class BusinessTicket here.
 *
 * @author winda naff
 * @version 14 Nov 2024
 */
public class BusinessTicket extends Ticket{
    public BusinessTicket(String penumpang, double harga_dasar){
        super(penumpang, harga_dasar);
    }

    @Override
    public double hitung_harga(){
        return harga_dasar * 1.25; // untuk tambah biaya 25%
    }
}