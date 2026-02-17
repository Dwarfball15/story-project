class Status {
    int health;
    int energy;
    int day;
    String location;

    Status(int health, int energy, int day, String location){
        this.health = health;
        this.energy = energy;
        this.day = day;
        this.location = location;
    }

    void display(){
        System.out.println("CURRENT STATUS:");
        System.out.println("HEALTH: "+ health);
        System.out.println("ENERGY: "+ energy);
        System.out.println("DAY: "+ day);

    }

}
