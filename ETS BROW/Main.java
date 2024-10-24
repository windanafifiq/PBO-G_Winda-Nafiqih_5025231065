
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pesanan baru
        FoodOrder order = new FoodOrder();

        // Menambahkan item ke pesanan
        order.addItem("Nasi Goreng", 20000);
        order.addItem("Ayam Goreng", 25000);

        // Menampilkan total harga pesanan
        System.out.println("Total Harga: Rp" + order.calculateTotalPrice());

        // Menghapus item dari pesanan
        order.removeItem("Ayam Goreng");

        // Menampilkan total harga setelah penghapusan
        System.out.println("Total Harga setelah penghapusan: Rp" + order.calculateTotalPrice());

        // Menandai pesanan sebagai dibayar
        order.markAsPaid();
        System.out.println("Apakah pesanan sudah dibayar? " + order.isOrderPaid());
    }
}
