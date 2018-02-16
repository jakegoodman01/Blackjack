package deckofcards;

public enum Suit {
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;

    /**
     * Getter for the suit name
     * @return The name of the suit as a lowercase String
     */
    public String getName() {
        return this.name().toLowerCase();
    }
}
