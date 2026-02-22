public class Backpack {
    String[] storage;


    Backpack(String[] storage) {
        this.storage = storage;
    }


    public void display() {
        System.out.println("------------------------------");
        System.out.println("    " + this.storage[0] + "   " + this.storage[1] + "   " + this.storage[2] + "    ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("    " + this.storage[3] + "   " + this.storage[4] + "   " + this.storage[5] + "    ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println("    " + this.storage[6] + "   " + this.storage[7] + "   " + this.storage[8] + "    ");
        System.out.println("------------------------------");

    }
}

