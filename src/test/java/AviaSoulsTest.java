import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.air.AviaSouls;
import ru.air.Ticket;
import ru.air.TicketTimeComparator;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void testSortTicket5() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "HEL", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "HEL", 600, 13, 15);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "HEL", 300, 5, 6);
        Ticket ticket5 = new Ticket("SPB", "BER", 700, 20, 23);
        Ticket ticket6 = new Ticket("SPB", "HEL", 200, 12, 14);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 12);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket6, ticket4, ticket1, ticket2, ticket7};
        Ticket[] actual = manager.search("SPB", "HEL");
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testSortTicket1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "HEL", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "HEL", 600, 13, 15);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "HEL", 300, 5, 6);
        Ticket ticket5 = new Ticket("SPB", "BER", 700, 20, 23);
        Ticket ticket6 = new Ticket("SPB", "HEL", 200, 12, 14);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 12);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("SPB", "BER");
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testSortTicketFalse() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SPB", "HEL", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "HEL", 600, 13, 15);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "HEL", 300, 5, 6);
        Ticket ticket5 = new Ticket("SPB", "BER", 700, 20, 23);
        Ticket ticket6 = new Ticket("SPB", "HEL", 200, 12, 14);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 12);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("SPB", "MSK");
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testCompTicket5() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("SPB", "DXB", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "DXB", 600, 13, 20);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "BER", 300, 5, 9);
        Ticket ticket5 = new Ticket("SPB", "DXB", 700, 17, 23);
        Ticket ticket6 = new Ticket("SPB", "DXB", 200, 12, 17);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 19);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket1, ticket6, ticket3, ticket5, ticket2};
        Ticket[] actual = manager.searchAndSortBy("SPB", "DXB", comparator);
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testCompTicket1() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("SPB", "DXB", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "DXB", 600, 13, 20);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "BER", 300, 5, 9);
        Ticket ticket5 = new Ticket("SPB", "DXB", 700, 17, 23);
        Ticket ticket6 = new Ticket("SPB", "DXB", 200, 12, 17);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 19);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.searchAndSortBy("SPB", "HEL", comparator);
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testCompTicketFalse() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("SPB", "DXB", 500, 10, 11);
        Ticket ticket2 = new Ticket("SPB", "DXB", 600, 13, 20);
        Ticket ticket3 = new Ticket("SPB", "DXB", 1000, 9, 15);
        Ticket ticket4 = new Ticket("SPB", "BER", 300, 5, 9);
        Ticket ticket5 = new Ticket("SPB", "DXB", 700, 17, 23);
        Ticket ticket6 = new Ticket("SPB", "DXB", 200, 12, 17);
        Ticket ticket7 = new Ticket("SPB", "HEL", 900, 11, 19);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {};
        Ticket[] actual = manager.searchAndSortBy("SPB", "MSK", comparator);
        Assertions.assertArrayEquals(actual, expected);
    }
}
