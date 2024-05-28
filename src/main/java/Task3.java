
import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> balloon = new HashMap<>();
        balloon.put('b', 0);
        balloon.put('a', 0);
        balloon.put('l', 0);
        balloon.put('o', 0);
        balloon.put('n', 0);

        for (char c : text.toCharArray()) {
            if (balloon.containsKey(c)) {
                balloon.put(c, balloon.get(c) + 1);
            }
        }

        return Math.min(balloon.get('b'), Math.min(balloon.get('a'), Math.min(balloon.get('l') / 2, Math.min(balloon.get('o') / 2, balloon.get('n')))));

    }
}
