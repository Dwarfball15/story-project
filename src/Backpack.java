public class Backpack {
    String[] storage;


    Backpack(String[] storage) {
        this.storage = storage;


    }


    public void display(Status player) {
        System.out.println("------------------------------");
        System.out.println("    " + player.storage[0] + "   " + player.storage[1] + "   " + player.storage[2] + "    ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("    " + player.storage[3] + "   " + player.storage[4] + "   " + player.storage[5] + "    ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("    " + player.storage[6] + "   " + player.storage[7] + "   " + player.storage[8] + "    ");
        System.out.println("------------------------------");

    }
}

