import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colors = {"negro", "rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(new Card(suits[i], colors[i / 2], values[j]));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        Card card = cards.remove(0);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en deck.");
    }

    public void pick() {
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        Card card = cards.remove(index);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en deck.");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            head();
        }
    }
}
