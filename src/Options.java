import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Options {
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

    public static void display(Status player, Scanner scanner, boolean running) {
        RandomEvent randomEvent = new RandomEvent();
        Randomitem item = new Randomitem();
        // Backpack backpack = new Backpack(player.storage); //sasha commented this out 2/22
        while (running) {
            System.out.println("1. Continue");
            System.out.println("2. Rest");
            System.out.println("3. Use Items");
            System.out.println("4. Check Inventory");
            System.out.println("5. Check Status");
            System.out.print("\nPlease select an option: ");
            int decisions = scanner.nextInt();
            switch (decisions) {
                case 1:
                    item.item(player);
                    player.phaseIndex++;
                    player.energy = player.energy - 5;
                    if (player.phaseIndex >= player.phase.length) {
                        player.day++;
                        player.phaseIndex = 0;
                        System.out.println("\nIt is now day: " + player.day);
                        System.out.println("It is now: " + player.phase[player.phaseIndex]);
                    } else {
                        System.out.println("\nIt is now: " + player.phase[player.phaseIndex]);
                    }
                    System.out.println("You find yourself in: " + player.location.genLocation());

                    if (player.energy == 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of energy!");
                        System.out.println("make you sure you sleep or use items to replenish your stats!");
                        System.exit(0);
                    }

                    if (player.health == 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of health!");
                        System.out.println("make you sure you use items to replenish your stats!");
                        System.exit(0);
                    }


                    break;

                case 2:
                    player.day++;
                    player.phaseIndex = 0;
                    System.out.println("You went to sleep...");
                    System.out.println("\nIt is now day " + player.day);
                    System.out.println("It is now: " + player.phase[player.phaseIndex]);
                    randomEvent.Encounter(player);

                    if (player.energy == 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of energy!");
                        System.out.println("make you sure you sleep or use items to replenish your stats!");
                        System.exit(0);
                    }

                    if (player.health == 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of health!");
                        System.out.println("make you sure you use items to replenish your stats!");
                        System.exit(0);
                    }


                    break;
                case 3:
                    player.backpack.display();
                    System.out.print("Please Select an Item (1-9): ");
                    int slot = scanner.nextInt() - 1;

                    switch (player.backpack.storage[slot]) {
                        case "Tater":
                            player.health += 10;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You ate the Potato! +10 Health");
                            break;

                        case "BAND":
                            player.health += 20;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You have used Bandages! +20 Health");
                            break;

                        case "CT":
                            player.energy += 10;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You have used Canteen! +10 Energy");
                            break;


                        case "EMPTY":
                            System.out.println("Nothing there!");
                            break;


                        default:
                            System.out.println("Please input a valid item!");
                    }

                    break;
                case 4:
                    System.out.println("          BACKPACK         ");
                    player.backpack.display(); //changed by Sasha 2/22
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


