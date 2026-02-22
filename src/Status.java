class Status {
    int health;
    int energy;
    int day;
    String location;
    String[] phase;
    int phaseIndex;
    String[] storage;

    Status(int health, int energy, int day, String location, String[] phase, int phaseIndex, String[] storage) {
        this.health = health;  // player health
        this.energy = energy; //player energy
        this.day = day;         //counts the day number
        this.location = location;    //might be used to determine where the player is?
        this.phase = phase;     //keeps track of time (morning, afternoon, evening)
        this.phaseIndex = phaseIndex;
        this.storage = storage;


    }

    void display() {
        System.out.println("CURRENT STATUS:");
        System.out.println("HEALTH: " + health);                //display method does literally nothing right now
        System.out.println("ENERGY: " + energy);                //the display of the status is in the "Options class"
        System.out.println("TIME: " + phase);
        System.out.println("DAY: " + day);

    }

}
