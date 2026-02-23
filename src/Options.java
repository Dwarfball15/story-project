import java.util.Scanner;


//Duy worked on this
public class Options {
    String Continue;
    String rest;
    String eat;
    String check;

    public static void display(Status player, Scanner scanner, boolean running, Room[] rooms) {
        RandomEvent randomEvent = new RandomEvent();
        Randomitem item = new Randomitem();

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
                    player.energy -= 5;

                    if (player.phaseIndex >= player.phase.length) {
                        player.day++;
                        player.phaseIndex = 0;
                        System.out.println("\nIt is now day: " + player.day);
                        System.out.println("It is now: " + player.phase[player.phaseIndex]);
                    } else {
                        System.out.println("\nIt is now: " + player.phase[player.phaseIndex]);
                    }

                    System.out.println("You find yourself in: " + player.location.genLocation());
                    new Room("", "", "", false, "").display(player, rooms);

                    // win condition
                    if (player.day >= 10) {
                        System.out.println("\n=====================================================");
                        System.out.println("You survived the Oregon Trail! YOU WIN!");
                        System.out.println("=====================================================");
                        System.exit(0);
                    }

                    if (player.energy <= 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of energy!");
                        System.out.println("Make sure you sleep or use items to replenish your stats!");
                        System.exit(0);
                    }

                    if (player.health <= 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of health!");
                        System.out.println("Make sure you use items to replenish your stats!");
                        System.exit(0);
                    }
                    break;

                case 2:
                    player.day++;
                    player.phaseIndex = 0;
                    player.energy -= 2;
                    System.out.println("You went to sleep...");
                    System.out.println("\nIt is now day " + player.day);
                    System.out.println("It is now: " + player.phase[player.phaseIndex]);
                    randomEvent.Encounter(player);

                    // win condition
                    if (player.day >= 10) {
                        System.out.println("\n=====================================================");
                        System.out.println("You survived the Oregon Trail! YOU WIN!");
                        System.out.println("=====================================================");
                        System.exit(0);
                    }

                    if (player.energy <= 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of energy!");
                        System.exit(0);
                    }

                    if (player.health <= 0) {
                        System.out.println("---------GAME OVER----------");
                        System.out.println("You ran out of health!");
                        System.exit(0);
                    }
                    break;

                case 3:
                    player.backpack.display();
                    System.out.print("Please Select an Item slot (1-9): ");
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
                            System.out.println("You used Bandages! +20 Health");
                            break;
                        case "CT":
                            player.energy += 10;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You drank from the Canteen! +10 Energy");
                            break;
                        case "PJ":
                            player.energy += 15;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You ate the Pickles! Surprisingly refreshing... +15 Energy");
                            break;
                        case "medicine":
                            player.health += 30;
                            player.backpack.storage[slot] = "EMPTY";
                            System.out.println("You used the Medicine! +30 Health");
                            break;
                        case "EMPTY":
                            System.out.println("Nothing there!");
                            break;
                        default:
                            System.out.println("You can't use that!");
                    }
                    break;

                case 4:
                    System.out.println("          BACKPACK         ");
                    player.backpack.display();
                    break;

                case 5:
                    System.out.println("\n-----STATUS-----");
                    System.out.println("DAY: " + player.day);
                    System.out.println("TIME: " + player.phase[player.phaseIndex]);
                    System.out.println("HEALTH:  " + player.health);
                    System.out.println("ENERGY:  " + player.energy + "\n");
                    break;

                default:
                    System.out.println("Invalid option, please choose 1-5");
            }
        }
    }
}