package deckofcards;

public enum Suit {
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;

    public String getName() {
        return this.name().toLowerCase();
    }
}
