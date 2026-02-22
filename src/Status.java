class Status {
    int health;
    int energy;
    int day;
    Location location;
    String[] phase;
    int phaseIndex;
    Backpack backpack;

    Status(int health, int energy, int day, String location, String[] phase, int phaseIndex, String[] storage) {
        this.health = health;  // player health
        this.energy = energy; //player energy
        this.day = day;         //counts the day number
        this.location = new Location(location);    //might be used to determine where the player is?
        this.phase = phase;     //keeps track of time (morning, afternoon, evening)
        this.phaseIndex = phaseIndex; //keeps track of time
        this.backpack = new Backpack(storage);


    }

    Status (String playerName){
        this.health = 100;
        this.energy = 50;
        this.day = 1;
        this.location = new Location("Beginning");
        this.phase = new String[] {"Morning", "Afternoon", "Evening"};
        this.phaseIndex = 0;
        this.backpack = new Backpack(new String[] {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"});
    }

    void display() {
        System.out.println("CURRENT STATUS:");
        System.out.println("HEALTH: " + health);                //display method does literally nothing right now
        System.out.println("ENERGY: " + energy);                //the display of the status is in the "Options class"
        System.out.println("TIME: " + phase);
        System.out.println("DAY: " + day);

    }

}
