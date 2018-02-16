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
     * Getter for the full card name
     * @return Card name, eg. "ace of spades"
     */
    public String getCardName() {
        return String.format("%s of %s",
                value.getName(),
                suit.getName());
    }

    /**
     * Getter for the short form of the card name
     * @return Card name in short form, eg. "A-s"
     */
    public String getCardNameShortForm() {
        if (value.getValue() >= 11 || value.getValue() == 1) {
            return String.format("%s-%s",
                    value.getName().toUpperCase().charAt(0),
                    suit.getName().charAt(0));
        } else {
            return String.format("%s-%s",
                    value.getValue(),
                    suit.getName().charAt(0));
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


