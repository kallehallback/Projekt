import java.util.*;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<Post>();
    public void addPost(String title, Author author, String content){
        Post newPost = new Post(title, author, content);
        posts.add(newPost);
    }
    public void removePost(String title) {
        for(int i=0;i< posts.size();i++){
            Post testPost = posts.get(i);
            if (testPost.getTitle().equals(title)){
                posts.remove(i);
            }
        }
    }
    public ArrayList<String> showTitles() {
        ArrayList<String> titles = new ArrayList<String>();
        for(int i=0;i<posts.size();i++){
            Post testPost = posts.get(i);
            titles.add(testPost.getTitle());
        }
        return titles;
    }
    public String showPost(String title) {
        String content = "";
        for(int i=0;i< posts.size();i++){
            Post testPost = posts.get(i);
            if (testPost.getTitle().equals(title)){
                content = testPost.getContent();
            }
        }
        return content;
    }
    public Author showAuthor(String title) {
        Author author = new Author(0,"","");
        for(int i=0;i< posts.size();i++){
            Post testPost = posts.get(i);
            if (testPost.getTitle().equals(title)){
                author = testPost.getAuthor();
            }
        }
        return author;
    }


}
