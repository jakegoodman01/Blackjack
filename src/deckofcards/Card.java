package deckofcards;

public class Card {
    private Suit suit;
    private Value value;

    /**
     * Initializes a new Card object
     * @param value The Value of the card
     * @param suit The Suit of the card
     */
    public Card (Value value, Suit suit) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Getter for the value name
     * @return Name of the value, eg. "five", "ace", "jack"
     */
    public String getValueName() {
        return value.getName();
    }

    /**
     * Getter for the suit name
     * @return Name of the suit, eg. "diamonds", "spades"
     */
    public String getSuitName() {
        return suit.getName();
    }
}


