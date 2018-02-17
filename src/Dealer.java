import deckofcards.*;

import java.util.List;
import java.util.Scanner;

public class Dealer {
    private Deck deck;
    private Hand dealer;
    private Hand player;

    /**
     * Initializes all private fields.
     * Shuffles the new deck.
     */
    public Dealer() {
        deck = new Deck();
        deck.shuffle();

        dealer = new Hand(deck);
        player = new Hand(deck);
    }

    /**
     * Deals each player 2 cards
     */
    public void beginGame() {
        System.out.println("Welcome to Blackjack!");
        dealer.hit();
        player.hit();
        dealer.hit();
        player.hit();
    }

    /**
     * Creates a new deck and then shuffles it, and clears the player and dealer cards
     */
    public void endGame() {
        deck = new Deck();
        deck.shuffle();
        dealer.clear();
        player.clear();
    }

    /**
     * Getter for the dealer's hand
     * @return The dealer's current cards
     */
    public List<Card> getDealerCards() {
        return dealer;
    }

    /**
     * Getter for the player's cards
     * @return The player's current cards
     */
    public List<Card> getPlayerCards() {
        return player;
    }


    public void promptForHit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to hit?\nPress 'h' to hit!");
        String choice = in.nextLine();

        if (choice.charAt(0) == 'h' && choice.length() == 1) {
            if (player.hit()) {
                System.out.println("Still alive!");
            } else {
                System.out.println("Bust!");
                System.exit(0);
            }
        }
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

    public int getDeckSize() {
        return deck.size();
    }


}