import deckofcards.*;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private Deck deck;
    private Hand dealerCards;
    private Hand playerCards;

    /**
     * Initializes all private fields.
     * Shuffles the new deck.
     */
    public Dealer() {
        deck = new Deck();
        deck.shuffle();

        dealerCards = new Hand();
        playerCards = new Hand();
    }

    /**
     * Deals each player 2 cards
     */
    public void beginGame() {
        System.out.println("Welcome to Blackjack!");
        dealerCards.add(deck.deal());
        playerCards.add(deck.deal());
        dealerCards.add(deck.deal());
        playerCards.add(deck.deal());
    }

    /**
     * Creates a new deck and then shuffles it, and clears the player and dealer cards
     */
    public void endGame() {
        deck = new Deck();
        deck.shuffle();
        dealerCards.clear();
        playerCards.clear();
    }

    /**
     * Getter for the dealer's hand
     * @return The dealer's current cards
     */
    public List<Card> getDealerCards() {
        return dealerCards;
    }

    /**
     * Getter for the player's cards
     * @return The player's current cards
     */
    public List<Card> getPlayerCards() {
        return playerCards;
    }


    /**
     * Finds the value of the given hand
     * @param hand A list of cards in the current hand
     * @return The int value of the given hand
     */
    private int getHandValue(List<Card> hand) {
        int handValue = 0;
        for (Card card : hand) {
            handValue += card.getCardValue();
        }
        return handValue;
    }
}