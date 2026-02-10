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
                player.energy = player.energy +10;
                System.out.println("Nothing happened!");
                System.out.println("It seems luck is on your side!");
                System.out.println("+10 energy!");
                break;

            case 3:
                player.energy = player.energy + 5;
                System.out.println("It seems that you couldn't sleep well last night....");
                System.out.println("+5 energy");
                break;

            case 4:
                player.energy = player.energy +15;
                System.out.println("Seemed like you slept well!");
                System.out.println("+15 energy");
                break;

            case 5:
                player.health = player.health - 20;
                System.out.println("An eagle dropped a giant rock on your head!!!!");
                System.out.println("-20 health");
                System.out.println("you have thoughts about shooting the eagle...");
                break;

            case 6:
                player.energy = player.energy +10;
                System.out.println("Nothing happened!");
                System.out.println("It seems luck is on your side!");
                System.out.println("+10 energy!");
                break;

            case 7:
                player.energy = player.energy - 5;
                System.out.println("You had a nightmare, you couldn't sleep all night...");
                System.out.println("-5 energy");
                break;

            case 8:
                player.energy = player.energy + 10;
                player.health = player.health - 5;
                System.out.println("It was a cold night than usual, you should've worn a jacket to sleep...");
                System.out.println("+10 energy");
                System.out.println("-5 health");
                break;

            case 9:
                player.health = player.health + 10;
                player.energy = player.energy + 10;
                System.out.println("You got hit with lighting!");
                System.out.println("Perhaps you got really lucky...");
                System.out.println("+10 energy");
                System.out.println("+10 health");
                break;

            case 10:
                System.out.println("Nothing happened...");
                System.out.println("Nothing ever happen...");
                break;

        }

    }

}
