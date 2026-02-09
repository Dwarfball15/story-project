class Status {
    int health;
    int energy;
    int day;

    Status(int health, int energy, int day){
        this.health = health;
        this.energy = energy;
        this.day = day;
    }

    void display(){
        System.out.println("CURRENT STATUS:");
        System.out.println("HEALTH: "+ health);
        System.out.println("ENERGY: "+ energy);
        System.out.println("DAY: "+ day);

    }

}
