
/**
 * Write a description of class motor here.
 *
 * @author winda naff
 * @version 07 Nov 2024
 */

public class motor extends kendaraan{
    private int jumlah_roda;

    public motor(String merk, String model, int tahun_produksi, int jumlah_roda){
        super(merk, model, tahun_produksi);
        this.jumlah_roda = jumlah_roda;
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jumlah Roda: " + jumlah_roda);
    }
}