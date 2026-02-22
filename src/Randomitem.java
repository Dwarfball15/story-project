import java.util.Random;
import java.util.Scanner;

public class Randomitem {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int counter = 0;

    int randomNum() {
        return random.nextInt(2) + 1;
    }


    int randomitem() {
        return random.nextInt(3) + 1;
    }


    public void item(Status player) {
        int PickleJar;
        int Potato;
        int RottenCorpse;
        int skeleton;
        int bandages;               //legit have no idea if im going to use these
        int tumbleWeed;
        int cactusFruits;

        if (randomNum() == 1) {
            switch (randomitem()) {
                case 1:
                    System.out.println("You found a pickle jar!");
                    System.out.print("Do you want to keep it? (Y/N):");
                    String pickup = scanner.next();
                    if (pickup.equalsIgnoreCase("y")) {
                        player.storage[counter] = "PJ";
                        counter++;
                        System.out.println("You have stored the Pickle Jar");

                    } else {
                        System.out.println("You did not pick up the item");
                    }
                    break;


                case 2:
                    System.out.println("You found a Potato!");
                    System.out.print("Would you like to pick it up? (Y/N):");
                    String pickup2 = scanner.next();
                    if (pickup2.equalsIgnoreCase("y")) {
                        player.storage[counter] = "Tater";
                        counter++;
                        System.out.println("You have stored the Potato");
                    } else {
                        System.out.println("You did not pick up the item");
                    }
                    break;


                case 3:
                    System.out.println("You found Bandages!");
                    System.out.print("Would you like to pick it up? (Y/N):");
                    String pickup3 = scanner.next();
                    if (pickup3.equalsIgnoreCase("y")) {
                        player.storage[counter] = "BAND";
                        counter++;
                        System.out.println("You have stored the Bandages");
                    } else {
                        System.out.println("You did not pick up the item");
                    }
                    break;


                case 4:
                    System.out.println("You found a Canteen!");
                    System.out.print("Would you like to pick it up? (Y/N):");
                    String pickup4 = scanner.next();
                    if (pickup4.equalsIgnoreCase("y")) {
                        player.storage[counter] = "CT";
                        counter++;
                        System.out.println("You have stored the Canteen");
                    } else {
                        System.out.println("You did not pick up the item");
                    }
                    break;

            }

        }


    }
}
