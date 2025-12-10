import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Classes.*;

class AuthorTest {

    @Test
    void testGetters() {
        Author a = new Author(1, "Anna", "anna@example.com");

        assertEquals(1, a.getId());
        assertEquals("Anna", a.getName());
        assertEquals("anna@example.com", a.getEmail());
    }

    @Test
    void testSetName() {
        Author a = new Author(2, "Sara", "sara@example.com");
        a.setName("Sara Test");

        assertEquals("Sara Test", a.getName());
    }

    @Test
    void testSetEmail() {
        Author a = new Author(3, "Bo", "bo@example.com");
        a.setEmail("new@example.com");

        assertEquals("new@example.com", a.getEmail());
    }

    @Test
    void testToStringNotNull() {
        Author a = new Author(4, "Lisa", "lisa@example.com");

        assertNotNull(a.toString());
    }
}
