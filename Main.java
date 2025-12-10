import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String choice = "bla";
            String title;
            String content;
            Blog blog = new Blog();
            Author author1 = new Author(1, "Kalle", "kalle@example.com");

            while (!choice.equals("0")) {

                System.out.println("MENY");
                System.out.println("1. Skapa en användare.");
                System.out.println("2. Skapa en bloggpost.");
                System.out.println("3. Visa blogg.");
                System.out.println("4. Radera en bloggpost.");
                System.out.println("0. Avsluta.");

                choice = scanner.nextLine();

                if (choice.equals("1")) {
                    System.out.println("Välj ett användar-id.");
                    int id = Integer.parseInt(scanner.nextLine());
                    author1.setId(id);

                    System.out.println("Välj ett användarnamn.");
                    String name = scanner.nextLine();
                    author1.setName(name);

                    System.out.println("Skriv din e-postadress.");
                    String mail = scanner.nextLine();
                    author1.setEmail(mail);
                    
                } else if (choice.equals("2")) {
                    System.out.println("Välj en titel.");
                    title = scanner.nextLine();
                    System.out.println("Skriv innehåll.");
                    content = scanner.nextLine();
                    blog.addPost(title, author1, content);
                    System.out.println("Tryck ENTER för att fortsätta.");
                    choice = scanner.nextLine();

                } else if (choice.equals("3")) {
                    Blogg blogg = new Blogg(blog);
                    blogg.listPosts();
                    System.out.println("Tryck ENTER för att fortsätta.");
                    choice = scanner.nextLine();

                } else if (choice.equals("4")) {
                    System.out.println("Skriv namnet på det inlägget du vill ta bort.");
                    title = scanner.nextLine();
                    blog.removePost(title);
                    System.out.println("Tryck ENTER för att fortsätta.");
                    choice = scanner.nextLine();
                }
            }
        }
    }
}