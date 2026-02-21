import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Options extends Random {
    String Continue;
    String rest;
    String eat;                                  //probably will delete this String in the end product
    String check;



    /*
    this class is responsible for the whole game loop
    mainly interacts with the "Status player" object that was made in main
    to change a certain aspect of the main character, make sure to do "player.(insert aspect you want to change)
                                                                                (list of aspects should be in main)
                                                                                  (or just check the status class)
     */

    public static void display(Status player, Scanner scanner, boolean running, int phaseIndex) {
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
                    player.phaseIndex++;
                    if (player.phaseIndex >= player.phase.length) {
                        player.phaseIndex = 0;
                        player.energy = player.energy - 5;
                    } else {
                        System.out.println("\nIt is now: " + player.phase[player.phaseIndex]);
                        break;
                    }
                case 2:
                    player.day++;
                    player.phaseIndex = 0;
                    player.energy = player.energy + 10;
                    System.out.println("You went to sleep...");
                    System.out.println("\nIt is now day " + player.day);
                    System.out.println("It is now: " + player.phase[player.phaseIndex]);


                    break;
                case 3:
                    System.out.println("you have selected 3");
                    break;
                case 4:
                    System.out.println("you have selected 4");
                    break;
                case 5:
                    System.out.println("\n-----STATUS-----");
                    System.out.println("DAY: " + player.day);
                    System.out.println("TIME: " + player.phase[0]);
                    System.out.println("HEALTH:  " + player.health);
                    System.out.println("ENERGY:  " + player.energy + "\n");
                    break;

                default:
            }
        }


    }
}


