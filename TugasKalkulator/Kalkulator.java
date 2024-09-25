import java.util.Scanner;

/**
 * Write a description of class Kalkulator here.
 *
 * @author Winda Nafiqih Irawan
 * @version (a version number or a date)
 */

public class Kalkulator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek Operator yang akan digunakan untuk melakukan operasi aritmatika
        Operator operator = new Operator();
        
        // Meminta input angka pertama dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        scanner.nextLine();  // Mengosongkan input buffer
        
        // Meminta input operator dari pengguna (penjumlahan, pengurangan, perkalian, pembagian)
        System.out.print("Masukkan operasi (penjumlahan, pengurangan, perkalian, pembagian): ");
        String operasi = scanner.nextLine();
        
        // Meminta input angka kedua dari pengguna
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        scanner.nextLine();  // Mengosongkan input buffer
        
        // Variabel untuk menyimpan hasil operasi
        double hasil = 0;
        
        // Melakukan operasi berdasarkan input pengguna
        switch (operasi) {
            case "penjumlahan":
                // Melakukan penjumlahan
                hasil = operator.tambah(angka1, angka2);
                break;
            case "pengurangan":
                // Melakukan pengurangan
                hasil = operator.kurang(angka1, angka2);
                break;
            case "perkalian":
                // Melakukan perkalian
                hasil = operator.kali(angka1, angka2);
                break;
            case "pembagian":
                // Melakukan pembagian dengan menangani pembagian oleh nol
                try {
                    hasil = operator.bagi(angka1, angka2);
                } catch (ArithmeticException e) {
                    // Menampilkan pesan kesalahan jika pembagian dengan nol
                    System.out.println(e.getMessage());
                    return;  // Menghentikan eksekusi jika terjadi kesalahan
                }
                break;
            default:
                // Menangani input operator yang tidak valid
                System.out.println("Operator tidak valid.");
                return;
        }
        
        // Menampilkan hasil operasi kepada pengguna
        System.out.println("Hasil: " + hasil);
        
        // Menutup objek Scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
