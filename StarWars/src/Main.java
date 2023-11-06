public class Main {
    public static void main(String[] args) {
        Mandalorian mandalorian = new Mandalorian();
        Jedi jedi = new Jedi();
        Entities winner;
        while (!jedi.knockedOut || !mandalorian.knockedOut) {
            mandalorian.lifeCurrent -= jedi.attack((int) (Math.random() * (5 - 1 + 1) + 1));
            if (mandalorian.lifeCurrent <= 0) {
                mandalorian.knockedOut = true;
                winner = jedi;
                System.out.println("mandalorian is out");
                break;
            }
            jedi.lifeCurrent -= mandalorian.attack((int) (Math.random() * (5 - 1 + 1) + 1));
            if (jedi.lifeCurrent <= 0) {
                jedi.knockedOut = true;
                winner = mandalorian;
                System.out.println("Jedi is out");
                break;
            }
        }
    }
}