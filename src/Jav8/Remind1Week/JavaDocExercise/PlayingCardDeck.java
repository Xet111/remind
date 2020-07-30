package Jav8.Remind1Week.JavaDocExercise;

import java.util.ArrayList;

public class PlayingCardDeck {
    private ArrayList<PlayingCard> deck = new ArrayList<>();

    public ArrayList<PlayingCard> getDeck() {
        return deck;
    }

    public ArrayList<PlayingCard> initializeDeck(){
        for (PlayingCardRank o : PlayingCardRank.values() ){
            for(PlayingCardSuit cardSuit : PlayingCardSuit.values()){
                deck.add(new PlayingCard(o.toString(), cardSuit.toString()));
            }
        }
        return deck;
    }

    @Override
    public String toString() {
        return "PlayingCardDeck{" +
                "deck=" + deck +
                '}';
    }

    public void setDeck(ArrayList<PlayingCard> deck) {
        this.deck = deck;

    }
}
