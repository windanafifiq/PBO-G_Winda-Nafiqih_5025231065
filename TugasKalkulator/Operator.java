/**
 * Write a description of class Operator here.
 *
 * @author Winda Nafiqih Irawan
 * @version (a version number or a date)
 */
public class Operator {
    // Operasi untuk penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Operasi untuk pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Operasi untuk perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Operasi untuk pembagian
    public double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!"); // Menghentikan program saat terjadi kesalahan
        }
    }
}
