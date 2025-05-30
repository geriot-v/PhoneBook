import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    @Test
    void testFindByNumber() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "111");
        assertEquals("Alice", book.findByNumber("111"));
    }
    @Test
    void testFindByNumberNotFound() {
        PhoneBook book = new PhoneBook();
        assertNull(book.findByNumber("111"));
    }
    @Test
    void testFindByName() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "111");
        assertEquals("111", book.findByName("Alice"));
    }
    @Test
    void testFindByNameNotFound() {
        PhoneBook book = new PhoneBook();
        assertNull(book.findByName("Nastya"));
    }
    @Test
    void testPrintAllNames() throws Exception {
        PhoneBook book = new PhoneBook();
        book.add("Nastya", "222");
        book.add("Alice", "111");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        book.printAllNames();

        String expected = "[Alice, Nastya]" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}
