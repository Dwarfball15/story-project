public class Random {
    java.util.Random random = new java.util.Random();

    public int randomNum() {
        return random.nextInt(10) + 1;
    }

    public void Encounter(Status player){
        /*
        base player stats:
        health: 100
        energy: 50             references


        Information for below:
        10 switch cases
        5 good
        5 bad
        should work out to 50 percent chance to land on an event for a new day

         */



        switch (randomNum()){
            case 1:
                System.out.println("\nCoyote attacked you while traveling!");
                System.out.println("You lose 25 health!");
                System.out.println("make sure you either sleep or eat to recover!");
                player.health = player.health - 25;

            case 2:
                System.out.println("Nothing happened!");
                System.out.println("It seems luck is on your side!");

            case 3:
        }

    }

}
