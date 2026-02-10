import java.util.Scanner;

public class Options {
    String Continue;
    String rest;
    String eat;
    String check;

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
                    System.out.println("you have selected 2");
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
                    System.out.println("Energy:  " + player.energy);

                    break;

                default:
            }
        }


    }
}


