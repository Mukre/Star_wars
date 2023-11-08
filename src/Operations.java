import java.util.Random;

public class Operations {
    public static int generateRandomInt(int min, int max){
        return ((int)(Math.random() * (min - max + 1) + min));
    }
}
