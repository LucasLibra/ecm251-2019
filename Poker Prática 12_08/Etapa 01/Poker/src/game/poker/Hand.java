package game.poker;

import utilities.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(List<Card> CardList) {
        this.cards = CardList;
    }

    public List<Card> getHand(){
        return this.cards;
    }

}
