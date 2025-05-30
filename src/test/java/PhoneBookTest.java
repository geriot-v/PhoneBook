import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void testAdd() {
        PhoneBook book = new PhoneBook();
        int count = book.add("Alice", "1111");
        assertEquals(1, count);
    }

    @Test
    void testAddMultipleEntries() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "111");
        int count = book.add("Nastya", "222");
        assertEquals(2, count);
    }
    @Test
    void testAddDupl() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "111");
        int count = book.add("Alice", "111");
        assertEquals(1, count);
    }
}
