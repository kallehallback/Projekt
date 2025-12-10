import static org.junit.jupiter.api.Assertions.*;

import Classes.Author;
import Classes.Blog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BlogTest {
    @Test
    void checkPost() {
        Blog testBlog = new Blog();
        Author testAuthor = new Author(1, "Test", "test@test.com");
        testBlog.addPost("Test title", testAuthor, "Test content");
        assertEquals("Test content", testBlog.showPost("Test title"));
    }

    @Test
    void checkAuthor() {
        Blog testBlog = new Blog();
        Author testAuthor = new Author(1, "Test", "test@test.com");
        testBlog.addPost("Test title", testAuthor, "Test content");
        assertEquals(testAuthor, testBlog.showAuthor("Test title"));
    }
    @Test
    void checkTitles() {
        ArrayList<String> testTitles = new ArrayList<String>();
        testTitles.add("Test title");
        Blog testBlog = new Blog();
        Author testAuthor = new Author(1, "Test", "test@test.com");
        testBlog.addPost("Test title", testAuthor, "Test content");
        assertEquals(testTitles, testBlog.showTitles());

    }

    @Test
    void checkDelete() {
        Blog testBlog = new Blog();
        Author testAuthor = new Author(1, "Test", "test@test.com");
        testBlog.addPost("Test title", testAuthor, "Test content");
        testBlog.removePost("Test title");
        assertNotEquals("Test content", testBlog.showPost("Test title"));
    }

}
