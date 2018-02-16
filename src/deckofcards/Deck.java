package deckofcards;

import java.util.LinkedList;
import java.util.Queue;

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




}
