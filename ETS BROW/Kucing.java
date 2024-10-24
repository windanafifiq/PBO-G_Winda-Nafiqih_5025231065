
/**
 * Write a description of class Kucing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Kelas turunan Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    // Override metode suara
    @Override
    public void suara() {
        System.out.println(nama + " mengeong: Meow Meow!");
    }
}