Hur man bygger projektet:

1. Hämta ner mappen "GroupProject".
2. Projektet är körbart i terminalen, men man behöver göra en ändring i Archive.java för att få sökvägen rätt. Man ändrar helt enkelt alla instanser av Path path = Path.of("src/main/java/Program/Archive/author.txt"); till Path path = Path.of("Archive/author.txt");. Därefter ändrar man också instanserna av Path path = Path.of("src/main/java/Program/Archive/posts.txt") till Path path = Path.of("Archive/posts.txt");.
3. Kompilera "Main.java" med "javac Main.java" i terminalen.
4. Kör programmet med "java Main" i terminalen.


