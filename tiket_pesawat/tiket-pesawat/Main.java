
/**
 * Write a description of class Main here.
 *
 * @author winda naff
 * @version 14 Nov 2024
 */
public class Main{
    public static void main(String[] args){
        Ticket economy_ticket = new EconomyTicket("Alexandra", 500000);
        Ticket business_ticket = new BusinessTicket("Thomas", 500000);
        Ticket firstclass_ticket = new FirstClassTicket("Anne", 500000);
    
        // nampilin informasi tiket
        System.out.println("=== Tiket Perjalanan Ekonomi ===");
        economy_ticket.tampilkan_output();
        
        System.out.println("=== Tiket Perjalanan Bisnis ===");
        business_ticket.tampilkan_output();
        
        System.out.println("=== Tiket Perjalanan Kelas Pertama ===");
        firstclass_ticket.tampilkan_output();
    }
}