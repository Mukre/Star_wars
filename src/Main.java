public class Main {
    public static void main(String[] args) {
        Mandalorian mandalorian = new Mandalorian();
        Jedi jedi = new Jedi();
        Sith sith = new Sith();
        Entities winner;
        winner = fight(sith, jedi);
    }
    public static Entities fight(Entities p1, Entities p2) {
        int randomFirst = ((int) (Math.random() * (2 - 1 + 1) + 1));
        Entities firstPlayer = p1;
        Entities secondPlayer = p2;
        switch (randomFirst) {
            case 1:
                firstPlayer = p1;
                secondPlayer = p2;
                break;
            case 2:
                firstPlayer = p2;
                secondPlayer = p1;
                break;
        }
        while (true) {
            secondPlayer.lifeCurrent -= firstPlayer.attack(((int) (Math.random() * (5 - 1 + 1) + 1)));
            if (p2.lifeCurrent <= 0) {
                p2.knockedOut = true;
                System.out.println(p2.name + " is knocked out");
                return firstPlayer;
            }
            firstPlayer.lifeCurrent -= secondPlayer.attack(((int) (Math.random() * (5 - 1 + 1) + 1)));
            if (firstPlayer.lifeCurrent <= 0) {
                firstPlayer.knockedOut = true;
                System.out.println(p1.name + " is knocked out");
                return secondPlayer;
            }

        }
    }
}