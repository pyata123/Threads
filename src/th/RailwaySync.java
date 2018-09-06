package th;

public class RailwaySync 
{
	  public static void main(String[] args)
	    {
	     TicketBooking ticketBooking1=new TicketBooking();
	     
	     
	     Customer customer1=new Customer(ticketBooking1);
	     Customer customer2=new Customer(ticketBooking1);
	     Customer customer3=new Customer(ticketBooking1);
	     
	     customer1.start();
	     customer2.start();
	     customer3.start();
	     
	     
	        
	        
	    }
	}
	class TicketBooking
	{
	int noOfTickets=10;
	synchronized public void bookTicket()
	{
	    noOfTickets--;
	    System.out.println(noOfTickets);
	}
	}
	class Customer extends Thread
	{
	    TicketBooking tb;
	    public Customer(TicketBooking tb)
	    {
	        this.tb=tb;
	    }
	    public void run()
	    {
	        tb.bookTicket();
	    }
	}
