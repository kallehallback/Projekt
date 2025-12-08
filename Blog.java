package Classes;
import java.util.*;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<Post>();
    public void addPost(String title, String author, String content){
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

}
