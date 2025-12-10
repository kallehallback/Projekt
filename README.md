Blogg.java är user interfacet som man ser när man kör programmet. Den printar allt genom att använda metoder från klasserna Blog, och Author.

javac Main.java för att kompilera
java Main för att köra programmet

Athenas dokumentation
Jag har gjort klassen Author. Den används för att spara information om en författare, till exempel id, namn och e-post. Klassen har tre variabler och vanliga getters och setters. Jag har också skrivit en enkel toString().

Tester
Jag har skrivit testklassen AuthorTest. Den testar att getters och setters fungerar som de ska och att toString() inte är null. Tester körs med JUnit 5.

Hur man bygger projektet
Projektet använder Maven.

