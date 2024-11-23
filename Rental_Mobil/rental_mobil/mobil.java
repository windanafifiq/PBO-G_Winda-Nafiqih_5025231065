
/**
 * Write a description of class mobil here.
 *
 * @author winda naff
 * @version 7 Nov 2024
 */

public class mobil extends kendaraan{
    private int jumlah_roda;

    public mobil(String merk, String model, int tahun_produksi, int jumlah_roda){
        super(merk, model, tahun_produksi);
        this.jumlah_roda = jumlah_roda;
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jumlah Roda: " + jumlah_roda);
    }
}