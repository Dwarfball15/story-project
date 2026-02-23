import java.util.Random;
import java.util.Scanner;
//sasha worked on this class
public class Room {
    String name;
    String description;
    String item;
    String challenge;
    boolean solved;
    String exit;
    Random random = new Random();

    Room(String name, String description, String item, String challenge, boolean solved, String exit) {
        this.name = name;
        this.description = description;
        this.item = item;
        this.challenge = challenge;
        this.solved = false;
        this.exit = exit;
    }

    Room(String name, String description, String challenge, boolean solved, String exit) {
        this.name = name;
        this.description = description;
        this.item = "EMPTY";
        this.challenge = challenge;
        this.solved = false;
        this.exit = exit;
    }

    int randomNum() { return random.nextInt(10) + 1; }

    public void display(Status player, Room[] rooms) {
        Scanner scanner = new Scanner(System.in);

        if (randomNum() <= 5) {  // 50% chance a building appears
            int roomPick = random.nextInt(3);
            Room current = rooms[roomPick];

            System.out.println("\nYou spot a " + current.name + " in the distance!");
            System.out.println(current.description);
            System.out.println("Exit direction: " + current.exit);
            System.out.print("Would you like to enter? (Y/N): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("You enter the " + current.name + "...");
                System.out.println("You look around...");
                System.out.println("You found " + current.item + "!");
                System.out.println("It seems important... *You store it for later*");

                // store item in first available slot
                for (int i = 0; i < player.backpack.storage.length; i++) {
                    if (player.backpack.storage[i].equals("EMPTY")) {
                        player.backpack.storage[i] = current.item;
                        break;
                    }
                }

                System.out.println("\nYou head towards the " + current.exit + " exit...");
                System.out.println("Oh no! A " + current.challenge + " is blocking your exit!");
                System.out.println("What are you going to do?");
                System.out.println("1. Throw the " + current.item + " as a distraction (lose item)");
                System.out.println("2. Take your chances and run past it (50/50)");
                System.out.println("3. Fight your way out (-30 health)");
                System.out.print("Please choose: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        for (int i = 0; i < player.backpack.storage.length; i++) {
                            if (player.backpack.storage[i].equals(current.item)) {
                                player.backpack.storage[i] = "EMPTY";
                                break;
                            }
                        }
                        System.out.println("You throw the " + current.item + "!");
                        System.out.println("The " + current.challenge + " is distracted!");
                        System.out.println("You sprint out through the " + current.exit + " exit safely!");
                        break;

                    case 2:
                        if (randomNum() <= 5) {
                            System.out.println("You dash past the " + current.challenge + " and make it out!");
                            System.out.println("Lucky escape!");
                        } else {
                            player.health -= 25;
                            System.out.println("The " + current.challenge + " catches you!");
                            System.out.println("You barely escape... -25 health");
                        }
                        break;

                    case 3:
                        player.health -= 30;
                        System.out.println("You fight the " + current.challenge + "!");
                        System.out.println("You win but took a beating... -30 health");
                        break;

                    default:
                        System.out.println("You panic and freeze... The " + current.challenge + " attacks!");
                        player.health -= 20;
                        System.out.println("-20 health");
                }

            } else {
                System.out.println("You ignore the " + current.name + " and keep moving...");
            }
        }
    }
}