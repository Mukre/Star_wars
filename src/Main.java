import java.util.Observable;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Jedi jedi = new Jedi();
        Sith sith = new Sith();
        fight(jedi, sith);
    }

    public static Entities fight(Entities p1, Entities p2) {
        Random ran = new Random();
        int randomInteger = ran.nextInt();
        Entities firstPlayer = p1;
        Entities secondPlayer = p2;
        if (randomInteger % 2 == 0) {
            firstPlayer = p2;
            secondPlayer = p1;
        }
        while (true) {
            secondPlayer.lifeCurrent -= firstPlayer.attack(Operations.generateRandomInt(1,5));
            if (secondPlayer.lifeCurrent <= 0) {
                secondPlayer.knockedOut = true;
                System.out.println(secondPlayer.name + " is knocked out");
                return firstPlayer;
            }
            firstPlayer.lifeCurrent -= secondPlayer.attack(Operations.generateRandomInt(1,5));
            if (firstPlayer.lifeCurrent <= 0) {
                firstPlayer.knockedOut = true;
                System.out.println(p1.name + " is knocked out");
                return secondPlayer;
            }

        }
    }
}