package deckofcards;

public enum Value {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int value;

    /**
     * Constructor for Value Enum
     * @param value The number value for each card
     */
    Value (int value) {
        this.value = value;
    }

    /**
     * Getter for value
     * @return The value as an int
     */
    public int getValue() {
        return value;
    }

    /**
     * Getter for the Value name
     * @return The value as a lowercase String
     */
    public String getName() {
        return this.name().toLowerCase();
    }
}
