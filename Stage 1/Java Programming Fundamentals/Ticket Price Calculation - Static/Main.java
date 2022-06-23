import java.util.*;

public class Main{
    public static void main (String[] args) {
        Ticket t = new Ticket();
        System.out.println("Enter no of booking:");
        Scanner sc = new Scanner(System.in);
        int booking = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTicket = sc.nextInt();
        t.setAvailableTickets(availableTicket);
        System.out.println("Enter the ticketid:");
        int ticketid = sc.nextInt();
        t.setTicketid(ticketid);
        System.out.println("Enter the price:");
        int price = sc.nextInt();
        System.out.println("Enter the no of tickets:");
        int nooftickets = sc.nextInt();
        System.out.println("Available tickets:"+t.getAvailableTickets());
        System.out.println("Total amount:"+t.calculateTicketCost(nooftickets));
        System.out.println("Available ticket after booking:"+t.getAvailableTickets());
    }
}