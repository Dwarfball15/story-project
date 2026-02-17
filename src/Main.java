import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("\nWelcome to group's 5 story game!");
        System.out.println("Make sure you remember to track HEALTH-INVENTORY-ENERGY");
        System.out.println("SURVIVE TEN DAYS TO WIN");
        System.out.println("HAVE FUN!!!!!!!!!!!!\n");

        int day = 1;
        int health = 100;
        int energy = 50;
        String location = "beginning";
        boolean running = true;


        Scanner scanner = new Scanner(System.in);

        Status player = new Status(health, energy, day,location);
        Options options = new Options();

        System.out.println("It is day 1, nothing seen for miles.\n"+
                "What would you like to do?\n");
        options.display(player, scanner,running);


    }
}