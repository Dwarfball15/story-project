import java.util.Random;
import java.util.Scanner;

public class Room {
    String name;
    String description;
    String item;
    String challenge;
    boolean solved;
    Random random = new Random();


    int randomNum(){ return random.nextInt(15) + 1;}
    int randomRoom() {return random.nextInt( 10) +1;}

    Room(String name, String description, String item, String challenge, boolean solved) {
        this.name = name;
        this.description = description;
        this.item = item;
        this.challenge = challenge;
        this.solved = false;
    }





    public void display(Status player) {
        Room room0 = new Room("Mine Shaft", "Seems like an old Mine Shaft when gold was abundant. There might be something down there...", "gold", "Dwarf", false);
        Room room1 = new Room("Old House", "It seems like an old home. Windows are broken and stained from time. It seems like no-one is home...", "cheese", "rabid wolf", false);
        Scanner scanner = new Scanner(System.in);
        if(randomNum() <= 5){
            if (randomRoom() <= 5){
                System.out.println("You found: " + room0.name);
                System.out.println(room0.description);
                System.out.print("Would you like to enter? (Y/N):");
                String choice = scanner.next();
                    if (choice.equalsIgnoreCase("y")){
                        System.out.println("You enter the the Old House...");
                        System.out.println("You look around...");
                        System.out.println("You found a " + room0.item + "!");
                        System.out.println("It seems important... *You store it for later*");
                        System.out.println("You head towards the exit.....Oh no! A " + room0.challenge +" is blocking your exit!");
                        System.out.println("What are you going to do now?");
                        System.out.println("1. Throw the item");
                        System.out.println("2. Take your chances and run past it");
                        System.out.print("Please choose:");
                        int option = scanner.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("You throw the item!");
                                System.out.println("It seems " + room0.challenge + " will ignore you for now...");
                                System.out.println("You run out the building");
                                break;


                            case 2:
                                System.out.println("You stored the item...");
                                System.out.println("You try to run past the " + room0.challenge);
                                player.backpack.storage[slot]
                        }

                    } else {
                        System.out.println("You ignore the building...");
                    }
            }
        }


    }
}

