
/**
 * Write a description of class parkingTicketMachine here.
 *
 * @author Winda Kelelahan
 * @version 25/10/24
 */
public class ParkingTicketMachine {
    // Atribut
    private int balance;
    private int ticketPrice;
    private int ticketTime;

    // Konstruktor
    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    // Metode untuk menambahkan uang
    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("Uang yang dimasukkan: Rp" + amount);
    }

    // Metode untuk mengeluarkan tiket
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance = balance % ticketPrice;
            System.out.println("Tiket berhasil dikeluarkan untuk " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak cukup. Masukkan lebih banyak uang.");
        }
    }

    // Metode untuk mendapatkan waktu parkir yang dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Metode untuk menampilkan saldo
    public int getBalance() {
        return balance;
    }
}
