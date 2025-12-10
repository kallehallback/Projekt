package Classes;

public class Blogg {

    private Blog blogg;
    
    public Blogg(Blog blogg) {
        this.blogg = blogg;
    }

    public void listPosts() {
        System.out.println("Blogginlägg:");
        Author author = new Author(0, "", "");

        for (String post : blogg.showTitles()) {
            author = blogg.showAuthor(post);
            int id = author.getId();
            String name = author.getName();
            String email = author.getEmail();
            System.out.println("------------");
            System.out.println(post + "\n");
            System.out.println(blogg.showPost(post) + "\n");
            System.out.println("ID: " + id + " Namn: " + name + " Mail: " + email);
        }
    }
}