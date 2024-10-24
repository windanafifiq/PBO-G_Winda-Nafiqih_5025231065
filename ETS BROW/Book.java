
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategori;

    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    public void printDetails() {
        System.out.println("Detail Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategori);
    }

    public static void main(String[] args) {
        Book buku1 = new Book("Laskar Pelangi", "Andrea Hirata", 2005, "Bentang Pustaka", "Novel");
        
        buku1.printDetails();
    }
}
