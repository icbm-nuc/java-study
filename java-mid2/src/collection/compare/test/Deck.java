package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard(cards);
        shuffle(cards);
    }

    private static void shuffle(List<Card> cards) {
        Collections.shuffle(cards);
    }

    private static void initCard(List<Card> cards) {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i,suit));
            }
        }
    }

    public Card drawCard() {
        return cards.removeFirst();
    }
}
