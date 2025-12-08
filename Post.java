package Classes;

public class Post {
    private String title;
    private Author author;
    private String content;


    public Post(String title, Author author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public String getTitle() {
        title = this.title;
        return title;
    }
    public Author getAuthor() {
        author = this.author;
        return this.author;
    }
    public String getContent() {
        content = this.content;
        return this.content;
    }
}
