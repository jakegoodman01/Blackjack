import deckofcards.Card;
import deckofcards.Deck;

import java.util.ArrayList;

public class Hand extends ArrayList<Card> {

    private Deck deck;

    public Hand (Deck deck) {
        this.deck = deck;
        add(deck.deal());
        add(deck.deal());
    }

    public boolean hit() {
        Card card;
        add(card = deck.deal());
        System.out.printf("You got: %s%n", card);
        return getHandValue() <= 21;
    }


    /**
     * Finds the value of the given hand
     * @return The int value of the given hand
     */
    public int getHandValue() {
        int handValue = 0;
        for (Card card : this) {
            handValue += card.getCardValue();
        }
        return handValue;
    }
}
