package deckofcards;

import java.util.*;

public class Deck {
    private Queue<Card> deck;

    /**
     * Initializes deck to a perfectly sorted new deck of cards
     */
    public Deck() {
        deck = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                deck.add(new Card(value, suit));
            }
        }
    }

    /**
     * Shuffles the deck of cards with the static method on Collections: shuffle
     */
    public void shuffle() {
        Collections.shuffle((List)deck);
    }

    /**
     * Getter for deck
     * @return The queue deck
     */
    public Queue<Card> getDeck() {
        return deck;
    }

    /**
     * Deals one card
     * @return A Card
     */
    public Card deal() {
        return deck.poll();
    }

    public void printCards() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }


}
