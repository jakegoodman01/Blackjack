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

    /**
     * In blackjack, the dealer has certain rules for hitting.
     * This method will run through that process
     * @return True if the dealer's hand remains in play after the hit
     */
    public boolean hitDealer() {
        while (getHandValue() <= 16) {
            hit();
        }
        return getHandValue() <= 21;
    }

    /**
     * Hits the player's hand
     * @return True if the player's hand remains in play after the hit
     */
    public boolean hit() {
        add(deck.deal());
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
