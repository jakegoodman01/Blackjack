public class Main {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        dealer.beginGame();

        while (true) {
            dealer.displayCurrentStatus();
            dealer.promptForTurn();
        }
    }
}
