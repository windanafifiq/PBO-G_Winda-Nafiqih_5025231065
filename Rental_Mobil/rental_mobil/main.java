
/**
 * Write a description of class main here.
 *
 * @author winda naff
 * @version 07 Nov 2024
 */
public class main{
    
    public static void main(String[] args) {
        rental_kendaraan rental = new rental_kendaraan();
        
        // nambah kendaraan brok
        mobil mobil1 = new mobil("Porsche", "Taycan", 2024, 2);
        motor motor1 = new motor("Yamaha", "NMax", 2022, 4);
        sepeda sepeda1 = new sepeda("Polygon", "Xtrada", 2019, "Gunung");
        
        rental.tambah_kendaraan(mobil1);
        rental.tambah_kendaraan(motor1);
        rental.tambah_kendaraan(sepeda1);
        
        // nampilin
        System.out.println("=== Kendaraan Awal ===");
        rental.tampilkan_kendaraan();
        
        // sewa
        rental.sewa_kendaraan("Haechan", mobil1);
        rental.sewa_kendaraan("Johnny", motor1);
        
        // nampilin yg sewa
        System.out.println("\n=== Daftar Penyewa ===");
        rental.tampilkan_penyewa();
        
        // nampilin kendaraan setelah disewa
        System.out.println("=== Kendaraan Setelah Disewa ===");
        rental.tampilkan_kendaraan();
    }
}
