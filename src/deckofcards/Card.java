package deckofcards;

public class Card {
    private Suit suit;
    private Value value;

    public Card (Value value, Suit suit) {
        this.suit = suit;
        this.value = value;
    }

    public String getValueName() {
        return value.getName();
    }

    public String getSuitName() {
        return suit.getName();
    }
}


