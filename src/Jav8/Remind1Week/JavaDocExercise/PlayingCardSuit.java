package Jav8.Remind1Week.JavaDocExercise;

public enum PlayingCardSuit {
    RED("red"),
    Black("black");
    private String suit;

    PlayingCardSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "PlayingCardSuit{" +
                "suit='" + suit + '\'' +
                '}';
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
