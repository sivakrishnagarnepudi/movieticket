public class CounterBooking extends MovieTicket{
    private int noOfSeats;
    public CounterBooking(String movieName, String theaterName, String showTime,int noOfSeats) {
        super(movieName, theaterName, showTime);
        this.noOfSeats = noOfSeats;
    }
    public int getNoOfSeats() {
         return noOfSeats;
}

    public int calculateTicketPrice(int ticketPrice) {
        return ticketPrice * noOfSeats;
    }
}
