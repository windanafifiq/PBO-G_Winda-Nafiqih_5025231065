
/**
 * Write a description of class FoodOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class FoodOrder {
    // Atribut
    private ArrayList<String> menuItems;
    private double totalPrice;
    private boolean isPaid;

    // Konstruktor
    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    // Menambahkan item ke pesanan
    public void addItem(String item, double price) {
        menuItems.add(item);
        totalPrice += price;
        System.out.println(item + " ditambahkan dengan harga Rp" + price);
    }

    // Menghapus item dari pesanan
    public void removeItem(String item) {
        if (menuItems.contains(item)) {
            menuItems.remove(item);
            System.out.println(item + " dihapus dari pesanan.");
        } else {
            System.out.println("Item tidak ditemukan di dalam pesanan.");
        }
    }

    // Menghitung total harga pesanan
    public double calculateTotalPrice() {
        return totalPrice;
    }

    // Menandai pesanan sebagai sudah dibayar
    public void markAsPaid() {
        isPaid = true;
        System.out.println("Pesanan telah dibayar.");
    }

    // Mendapatkan total harga pesanan
    public double getTotalPrice() {
        return totalPrice;
    }

    // Mendapatkan daftar item menu
    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    // Mengecek apakah pesanan sudah dibayar
    public boolean isOrderPaid() {
        return isPaid;
    }
}
