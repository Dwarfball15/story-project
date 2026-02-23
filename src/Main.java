import java.util.Scanner;
//Duy and Gared worked on this

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=====================================================");
        System.out.println("           WELCOME TO THE OREGON TRAIL              ");
        System.out.println("=====================================================");
        System.out.println("The year is 1848. You are a pioneer heading west");
        System.out.println("from Independence, Missouri to the Willamette Valley");
        System.out.println("in Oregon. The journey is 2,000 miles long and full");
        System.out.println("of danger. You must survive 10 days to reach Oregon!");
        System.out.println("\nHOW TO PLAY:");
        System.out.println("- Manage your HEALTH and ENERGY carefully");
        System.out.println("- Continue to travel and find items along the way");
        System.out.println("- Rest to recover energy but watch out for events!");
        System.out.println("- Enter buildings to find useful items");
        System.out.println("- Use items to restore health and energy");
        System.out.println("- Survive 10 days to win!");
        System.out.println("=====================================================\n");

        boolean running = true;

        Room[] rooms = {
                new Room("Mine Shaft", "Seems like an old Mine Shaft when gold was abundant. There might be something down there...", "gold", "Dwarf", false, "North"),
                new Room("Old House", "It seems like an old home. Windows are broken and stained from time. It seems like no-one is home...", "cheese", "Rabid Wolf", false, "East"),
                new Room("Abandoned Wagon", "A busted up old wagon sits on the side of the trail. Whoever owned it didn't make it far...", "medicine", "Rattlesnake", false, "West")
        };

        Scanner scanner = new Scanner(System.in);

        Status player = new Status("Pioneer");
        Options options = new Options();

        System.out.println("It is day 1, nothing seen for miles.");
        System.out.println("What would you like to do?");
        System.out.println("It is now: " + player.phase[player.phaseIndex] + "\n");
        options.display(player, scanner, running, rooms);
    }
}