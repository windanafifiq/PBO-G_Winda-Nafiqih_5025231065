// Kelas induk (superclass)
class Hewan {
    // Atribut kelas induk
    String nama;

    // Konstruktor kelas induk
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Metode kelas induk
    public void suara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    // Override metode suara
    @Override
    public void suara() {
        System.out.println(nama + " menggonggong: Woof Woof!");
    }
}

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

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Anjing anjing = new Anjing("Rex");
        Kucing kucing = new Kucing("Luna");
        Sapi sapi = new Sapi("Bella");
        
        // Memanggil metode suara untuk masing-masing hewan
        anjing.suara();
        kucing.suara();
        sapi.suara();
    }
}