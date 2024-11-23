
/**
 * Write a description of class kendaraan here.
 *
 * @author winda naff
 * @version 07 Nov 2024
 */

public class kendaraan{
    protected String merk;
    protected String model;
    protected int tahun_produksi;

    public kendaraan(String merk, String model, int tahun_produksi){
        this.merk = merk;
        this.model = model;
        this.tahun_produksi = tahun_produksi;
    }

    public void tampilkan(){
        System.out.println("Merk: " + merk + ", Model: " + model + ", tahun_produksi: " + tahun_produksi);
    }
}
