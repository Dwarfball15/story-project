public class Room {
    String name;
    String description;
    String item;
    String challenge;
    boolean solved;


    Room(String name, String description, String item, String challenge, boolean solved) {
        this.name = name;
        this.description = description;
        this.item = item;
        this.challenge = challenge;
        this.solved = false;
    }


}

