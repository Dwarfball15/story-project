import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------------Welcome to group's 5 story game!---------------------");
        System.out.println("Make sure you remember to track HEALTH-INVENTORY-ENERGY");
        System.out.println("SURVIVE TEN DAYS TO WIN");
        System.out.println("HAVE FUN!!!!!!!!!!!!\n");

        int day = 1;
        int health = 100;
        int energy = 50;
        String location = "beginning";
        boolean running = true;
        String[] phase = {"Morning", "Afternoon", "Evening"};
        int phaseIndex = 0;
        String[] storage = {"EMPTY" + "EMPTY" + "EMPTY" + "EMPTY" + "EMPTY" + "EMPTY" + "EMPTY" + "EMPTY" + "EMPTY"};


        Scanner scanner = new Scanner(System.in);

        Status player = new Status(health, energy, day, location, phase, phaseIndex, storage);
        Options options = new Options();

        System.out.println("It is day 1, nothing seen for miles.\n" +
                "What would you like to do?");
        System.out.println("it is now: " + player.phase[player.phaseIndex] + "\n");
        options.display(player, scanner, running, phaseIndex);


    }
}