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
    }

    /**
     * Deals each player 2 cards
     */
    public void beginGame() {
        System.out.println("Welcome to Blackjack!");
        deck.shuffle();

        dealer = new Hand(deck);
        player = new Hand(deck);
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

    public void promptForHit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to hit?\nPress 'h' to hit!");
        String choice = in.nextLine();

        if (choice.length() == 1 && choice.charAt(0) == 'h') {
            if (player.hit()) {
                System.out.println("Still alive!");
            } else {
                System.out.println("Bust!");
                System.exit(0);
            }
        }
    }

    public void displayCurrentStatus () {
        System.out.println();
        System.out.print("Dealer's cards: ");
        for (Card card : dealer) {
            System.out.print(card + ", ");
        }
        System.out.printf("value: %d", dealer.getHandValue());
        System.out.println();

        System.out.print("Player's cards: ");
        for (Card card : player) {
            System.out.print(card + ", ");
        }
        System.out.printf("value: %d", player.getHandValue());
        System.out.println();
        System.out.printf("%n%n%n");
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
}