// This file was edited 2/22/26 by Sasha Barry (samuelb2@umbc.edu)
// This class handles the locations in the game, and randomly generates numbers and items for them.
import java.util.Random;
public class Location {
    String location;
    final String[] locationPrefix = {"The Caves of ", "The Fields of ", "The Forest of "};
    final String[] locationSuffix = {"Malice", "Glamour", "Indifference"};
    Random rand = new Random();
    Location(String location) {
        this.location = location;
    }

    public String genLocation() {
        int rand1 = (int)Math.floor(rand.nextDouble() * 3);
        int rand2 = (int)Math.floor(rand.nextDouble() * 3);
        return locationPrefix[rand1] + locationSuffix[rand2];
    }
}
