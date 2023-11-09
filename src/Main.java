import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jedi jedi = new Jedi("Sifo-Dyas", 1, 20, 25, 140);
        Sith sith = new Sith("Count Dooku", 1, 20, 25, 140);
        Mandalorian mandalorian = new Mandalorian();
        Operations op = new Operations();
        ArrayList<Entity> entities = new ArrayList<>();

        entities.add(jedi);
        entities.add(mandalorian);
        entities.add(sith);
        Entity p1 = entities.get(op.generateRandomInt(0, entities.size() - 1));
        entities.remove(p1);
        Entity p2 = entities.get(op.generateRandomInt(0, entities.size() - 1));
        entities.remove(p2);

        Entity winner = fight(p1, p2);

    }
    public static Entity fight(Entity p1,Entity p2){
        Random ran = new Random();
        int randomInteger = ran.nextInt();
        Entity firstPlayer = p1;
        Entity secondPlayer = p2;
        if (randomInteger % 2 == 0) {
            firstPlayer = p2;
            secondPlayer = p1;
        }
        while (!firstPlayer.knockedOut && !secondPlayer.knockedOut){
            firstPlayer.performAttack(firstPlayer, secondPlayer);
            if (firstPlayer.knockedOut || secondPlayer.knockedOut)
                break;
            secondPlayer.performAttack(secondPlayer, firstPlayer);
        }
        if (secondPlayer.knockedOut && firstPlayer.knockedOut){
            System.out.println("Draw");
            return null;
        }
        if (secondPlayer.knockedOut)
            return firstPlayer;
        else
            return secondPlayer;

    }
}