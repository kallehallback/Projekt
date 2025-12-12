import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    @Test
    void checkTitle() {
        Author testAuthor = new Author(1, "Test", "test@test.com");
        Post testPost = new Post("Test title", testAuthor, "Test content");
        assertEquals("Test title", testPost.getTitle());
    }
    @Test
    void checkAuthor() {
        Author testAuthor = new Author(1, "Test", "test@test.com");
        Post testPost = new Post("Test title", testAuthor, "Test content");
        assertEquals(testAuthor, testPost.getAuthor());
    }
    @Test
    void checkContent() {
        Author testAuthor = new Author(1, "Test", "test@test.com");
        Post testPost = new Post("Test title", testAuthor, "Test content");
        assertEquals("Test content", testPost.getContent());
    }
}
