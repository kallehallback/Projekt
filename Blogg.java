public class Blogg {

    private Blog blogg;
    
    public Blogg(Blog blogg) {
        this.blogg = blogg;
    }

    public void listPosts() {
        System.out.println("Blogginlägg:");

        for (String post : blogg.showTitles()) {
            System.out.println("------------");
            System.out.println(post + "\n");
            System.out.println(blogg.showPost(post) + "\n");
            System.out.println("Av: " + blogg.showAuthor(post));
        }
    }
}
