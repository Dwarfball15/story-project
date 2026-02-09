import java.util.Scanner;

public class Options {
    String Continue;
    String rest;
    String eat;
    String check;

    int display(Status player, Scanner scanner) {
        System.out.println("1. Continue");
        System.out.println("2. rest");
        System.out.println("3. eat");
        System.out.println("4. check inventory");
        System.out.println("5. check status");
        System.out.print("\nPlease select an option: ");
        int decisions = scanner.nextInt();
        switch (decisions) {
            case 1:
                System.out.println("you have selected 1");
                player.day++;
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
                System.out.println("you have selected 5");
                break;

            default:


        } return player.day;
    }
}
