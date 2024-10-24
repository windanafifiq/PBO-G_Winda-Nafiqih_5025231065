
/**
 * Write a description of class Sapi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Kelas turunan Sapi
class Sapi extends Hewan {
    public Sapi(String nama) {
        super(nama);
    }

    // Override metode suara
    @Override
    public void suara() {
        System.out.println(nama + " melenguh: Moo Moo!");
    }
}