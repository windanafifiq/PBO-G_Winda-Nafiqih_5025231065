/**
 * Write a description of class Lot here.
 *
 * @author Winda Nafiqih Irawan
 * @version October 2, 2024
 */
public class Lot {
    private int number;
    private String description;
    private Bid highestBid;
    
    public Lot(int number, String description) {
        this.number = number;
        this.description = description;
        this.highestBid = null;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Bid getHighestBid() {
        return highestBid;
    }
    
    public boolean bidFor(Bid bid) {
        if (highestBid == null || bid.getValue() > highestBid.getValue()) {
            highestBid = bid;
            return true;
        }
        return false;
    }
    
    public String toString() {
        if (highestBid != null) {
            return number + ": " + description + " (Highest bid: " + highestBid.getValue() + ")";
        } else {
            return number + ": " + description + " (No bids)";
        }
    }
}
