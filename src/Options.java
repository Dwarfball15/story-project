import java.sql.SQLOutput;
import java.util.Scanner;

public class Options {
    String Continue;
    String rest;
    String eat;
    String check;


    /*
    this class is responsible for the whole game loop
    mainly interacts with the "Status player" object that was made in main
    to change a certain aspect of the main character, make sure to do "player.(insert aspect you want to change)
                                                                                (list of aspects should be in main)
                                                                                  (or just check the status class)
     */

    public static void display(Status player, Scanner scanner, boolean running) {
        while (running) {
            System.out.println("1. Continue");
            System.out.println("2. rest");
            System.out.println("3. eat");
            System.out.println("4. check inventory");
            System.out.println("5. check status");
            System.out.print("\nPlease select an option: ");
            int decisions = scanner.nextInt();
            switch (decisions) {
                case 1:
                    player.day++;
                    player.energy = player.energy - 25;
                    System.out.println("\nIt is now day " + player.day);
                    break;
                case 2:
                    player.day++;
                    player.energy = player.energy + 10;
                    System.out.println("You went to sleep...");
                    System.out.println("\nIt is now day " + player.day);
                    break;
                case 3:
                    System.out.println("you have selected 3");
                    break;
                case 4:
                    System.out.println("you have selected 4");
                    break;
                case 5:
                    System.out.println("\n-----STATUS-----");
                    System.out.println("Day: " + player.day);
                    System.out.println("Health:  " + player.health);
                    System.out.println("Energy:  " + player.energy + "\n");

                    break;

                default:
            }
        }


    }
}


