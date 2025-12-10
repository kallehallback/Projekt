package Classes;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Archive {
    public Author readAuthor() {
        int id = 0;
        String name = "";
        String mail = "";
        Path path = Path.of("src\\main\\java\\Classes\\author.txt");
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line=br.readLine()) != null) {
                String[] auth = line.split("///");
                id = Integer.parseInt(auth[0]);
                name = auth[1];
                mail = auth[2];
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        catch(IOException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        Author author = new Author(id, name, mail);
        return author;
    }
    public Blog readPosts() {
        Author author = readAuthor();
        String title = "";
        String text = "";
        Blog blogg = new Blog();
        Path path = Path.of("src\\main\\java\\Classes\\posts.txt");
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line=br.readLine()) != null) {
                String[] pst = line.split("///", 3);
                title = pst[1];
                text = pst[2];
                blogg.addPost(title,author, text);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        catch(IOException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        return blogg;
    }
    public void writeAuthor(Author author){
        int id = author.getId();
        String name = author.getName();
        String mail = author.getEmail();
        Path path = Path.of("src\\main\\java\\Classes\\author.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(id+"///"+name+"///"+mail);
        }
        catch(FileNotFoundException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        catch(IOException e){
            System.out.println("Kan inte hitta arkiv!");
        }
    }
    public void writePost(String title, String text){
        Author author = readAuthor();
        String name = author.getName();
        Path path = Path.of("src\\main\\java\\Classes\\posts.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\main\\java\\Classes\\posts.txt", true))) {
            writer.newLine();
            writer.write(name + "///" + title + "///" + text);
        }
        catch(FileNotFoundException e){
            System.out.println("Kan inte hitta arkiv!");
        }
        catch(IOException e){
            System.out.println("Kan inte hitta arkiv!");
        }

    }

}
