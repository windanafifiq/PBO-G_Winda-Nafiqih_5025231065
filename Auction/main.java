/**
 * Write a description of class main here.
 *
 * @author Winda Nafiqih Irawan
 * @version October 2, 2024
 */
public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.enterLot("Antique Vase");
        auction.enterLot("Vintage Car");

        Person person1 = new Person("John Doe");
        Person person2 = new Person("Jane Smith");

        // Making bids
        auction.makeBid(1, person1, 100);
        auction.makeBid(1, person2, 200);  // Higher bid for the same lot
        auction.makeBid(2, person1, 150);  // Bidding on another lot

        // Showing the lots and their highest bids
        auction.showLots();
    }
}
