
/**
 * Write a description of class Ticket here.
 *
 * @author winda naff
 * @version 14 Nov 2024
 */

public class Ticket {
    protected String penumpang;
    protected double harga_dasar;

    public Ticket(String penumpang, double harga_dasar){
        this.penumpang = penumpang;
        this.harga_dasar = harga_dasar;
    }

    public double hitung_harga(){
        return harga_dasar; // harga default tanpa diskon atau biaya tambahan
    }
    
    public void tampilkan_output(){
        System.out.println("Penumpang: " + penumpang);
        System.out.println("Harga Tiket: " + hitung_harga());
    }
}