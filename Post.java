package Classes;

public class Post {
    private String title;
    private String author;
    private String content;


    public Post(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public String getTitle() {
        title = this.title;
        return title;
    }
    public String getAuthor() {
        author = this.author;
        return author;
    }
    public String getContent() {
        author = this.content;
        return content;
    }
}
