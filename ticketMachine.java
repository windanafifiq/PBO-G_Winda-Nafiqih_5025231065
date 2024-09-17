/**
 * Write a description of class ticketMachine here.
 *
 * @author Winda Nafiqih Irawan
 * @version (a version number or a date)
 */
public class ticketMachine
{
    private int price;
    private int balance;
    private int total;
    
    public ticketMachine(int ticketCost){
        price = ticketCost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void insertMoney(int amount){
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount: " + amount);
        }
    }
    
    public void printTicket(){
        int amountLeftToPay;
        amountLeftToPay = price - balance;
        
        if(amountLeftToPay <= 0){
            System.out.println("##########################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##########################");
            System.out.println();
            
            total = total + price;
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least : " + amountLeftToPay + " more cents.");
            
        }
    }
}
