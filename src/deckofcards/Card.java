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
     * toString returns the card name in short form
     * @return Card name in short form, eg. "A-s"
     */
    @Override
    public String toString() {
        if (value.getValue() >= 11 || value.getValue() == 1) {
            return String.format("%s%s",
                    value.getName().charAt(0),
                    suit.getName().toLowerCase().charAt(0));
        } else {
            return String.format("%s%s",
                    value.getValue(),
                    suit.getName().toLowerCase().charAt(0));
        }
    }

    /**
     * Getter for the card value
     * @return Value of the card
     */
    public int getCardValue() {
        return value.getValue();
    }
}


