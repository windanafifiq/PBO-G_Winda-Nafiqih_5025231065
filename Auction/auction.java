/**
 * Write a description of class Auction here.
 *
 * @author Winda Nafiqih Irawan
 * @version October 2, 2024
 */
import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots;
    private int nextLotNumber;
    
    public Auction() {
        this.lots = new ArrayList<>();
        this.nextLotNumber = 1;
    }
    
    public void enterLot(String description) {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }
    
    public Lot getLot(int lotNumber) {
        for (Lot lot : lots) {
            if (lot.getNumber() == lotNumber) {
                return lot;
            }
        }
        return null;
    }
    
    public void showLots() {
        for (Lot lot : lots) {
            System.out.println(lot);
        }
    }
    
    public void makeBid(int lotNumber, Person bidder, long value) {
        Lot selectedLot = getLot(lotNumber);
        if (selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if (successful) {
                System.out.println("Bid accepted.");
            } else {
                System.out.println("Bid too low.");
            }
        } else {
            System.out.println("Lot number " + lotNumber + " not found.");
        }
    }
}
