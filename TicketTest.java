public class TicketTest {
    public static void main(String[] args) {
        LoginProcess login = new LoginProcess();
        boolean user = login.login("Neoteric", "TechJunkies");

        if (user) {
            System.out.println("Login Successful");


            MovieTicket ticket = new CounterBooking("Avengers", "Cineplex", "6:00 PM", 3);


            System.out.println("Movie: " + ticket.getMovieName());
            System.out.println("Theater: " + ticket.getTheaterName());
            System.out.println("Show Time: " + ticket.getShowTime());



        } else {
            System.out.println("Login Failed");
        }
    }
}
