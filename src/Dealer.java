import deckofcards.*;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private Deck deck;
    private List<Card> dealerCards;
    private List<Card> playerCards;

    /**
     * Initializes all private fields.
     * Shuffles the new deck.
     */
    public Dealer() {
        deck = new Deck();
        deck.shuffle();

        dealerCards = new ArrayList<>();
        playerCards = new ArrayList<>();
    }

    /**
     * Deals each player 2 cards
     */
    public void beginGame() {
        dealerCards.add(deck.deal());
        playerCards.add(deck.deal());
        dealerCards.add(deck.deal());
        playerCards.add(deck.deal());
    }

    public List<Card> getDealerCards() {
        return dealerCards;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }
}
