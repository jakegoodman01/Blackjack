import deckofcards.*;

public class Main {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        dealer.beginGame();

        System.out.print("Dealer's cards: ");
        for (Card card : dealer.getDealerCards()) {
            System.out.print(card + " ");
        }
        System.out.println();

        System.out.print("Player's cards: ");
        for (Card card : dealer.getPlayerCards()) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
