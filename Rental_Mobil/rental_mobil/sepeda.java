
/**
 * Write a description of class sepeda here.
 *
 * @author winda naff
 * @version 07 Nov 2024
 */

public class sepeda extends kendaraan {
    private String jenis_sepeda;

    public sepeda(String merk, String model, int tahun_produksi, String jenis_sepeda){
        super(merk, model, tahun_produksi);
        this.jenis_sepeda = jenis_sepeda;
    }

    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jenis Sepeda: " + jenis_sepeda);
    }
}
