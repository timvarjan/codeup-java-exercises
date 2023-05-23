package src;
import java.util.Random;
public class ServerNameGenerator {
//    Server Name Generator
//
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
public static void main(String[] args) {
    String[] adjectives = {"friendly", "happy", "generous", "nice", "smart", "loud", "fast", "calm", "cheerful", "great"};

    String[] nouns = {"cat", "dog", "museum", "vehicle", "ice", "tree", "dirt", "tower", "computer", "building"};

            Random random = new Random();
            int randomAdj = random.nextInt(adjectives.length);
            String randomAdjElement = adjectives[randomAdj];
//            System.out.println("Random Element: " + randomAdjElement);

    int randomNoun = random.nextInt(adjectives.length);
    String randomNounElement = nouns[randomNoun];
    System.out.println("Random Phrase: " + randomAdjElement + "-" + randomNounElement);
        }
    }



//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.


