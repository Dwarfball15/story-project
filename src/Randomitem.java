import java.util.Random;

public class Randomitem {
    Random random = new Random();

    public int randomNum() {
        return random.nextInt(4) + 1;
    }

    public int random3() {
        return random.nextInt(3) + 1;
    }


    public void item(Status player) {
        int PickleJar;
        int Potato;
        int RottenCorpse;
        int skeleton;
        int bandages;
        int tumbleWeed;
        int cactusFruits;

        if (randomNum() == 1) {
            switch (random3()) {
                case 1:
                    player.location = "Abandoned shack";
                    break;

                case 2:
                    player.location = "Spooky mineshaft";
                    break;


                case 3:
                    player.location = "";
                    System.out.println("Would yo");
                    break;


                default:
            }


        } else {
            System.out.println("While continuing, you didn't come across anything");
        }


    }
}
