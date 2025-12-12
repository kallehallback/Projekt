import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArchiveTest {
    @Test
    void checkAuthor() {
        Archive checkArchive = new Archive();
        Author testAuthor = new Author(1, "David", "david@skansholm.com");
        checkArchive.writeAuthor(testAuthor);
        Author testAuthor2 = checkArchive.readAuthor();
        String expectedContent = 1 + "David" + "david@skansholm.com";
        String checkContent = testAuthor2.getId() + testAuthor2.getName() + testAuthor2.getEmail();
        assertEquals(expectedContent, checkContent);
    }

    @Test
    void checkPost() {
        Archive checkArchive = new Archive();
        Blog testBlog = checkArchive.readPosts();
        Author checkAuthor = checkArchive.readAuthor();
        String authorName = checkAuthor.getName();
        testBlog.addPost("Title", checkAuthor, "text");
        checkArchive.writePost("Title", "text");
        Blog testBlog2 = checkArchive.readPosts();
        String checkContent = testBlog2.showPost("Title");
        String expected = authorName + "Title" + "text";
        String check = authorName + "Title" + checkContent;
        assertEquals(expected, check);

    }
}
