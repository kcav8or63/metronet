package com.silversky.metronet.cardsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void sort(boolean ascending){
        if (ascending) {
            Collections.sort(getCards());
        } else {
            Collections.sort(getCards(), Collections.reverseOrder());
        }
    }

    public void addCard(Card card){
        getCards().add(card);
    }

}
