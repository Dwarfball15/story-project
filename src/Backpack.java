public class Backpack {
    String[] storage;


    Backpack(String[] storage) {
        this.storage = storage;


    }


    public void display(Status player) {
        System.out.println("------------------------------");
        System.out.println("|   " + player.storage[0] + "   " + player.storage[1] + "   " + player.storage[2] + "   |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("|                           |");
        System.out.println("------------------------------");

    }
}

