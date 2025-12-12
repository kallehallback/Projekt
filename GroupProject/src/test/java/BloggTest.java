import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloggTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void testListPosts() {
        Blog blog = new Blog();
        Author author1 = new Author(1, "Kalle", "kalle@example.com");
        blog.addPost("blabla", author1, "blablabla.");

        Blogg blogg = new Blogg(blog);
        blogg.listPosts();

        String expected = String.join("\n",
                "Blogginlägg:",
                "------------",
                "blabla",
                "",
                "blablabla.",
                "",
                "ID: 1 Namn: Kalle Mail: kalle@example.com"
        );

        assertEquals(
                expected.replace("\r\n", "\n"),
                output.toString().trim().replace("\r\n", "\n")
        );
    }
}