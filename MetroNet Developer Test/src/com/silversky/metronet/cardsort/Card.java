package com.silversky.metronet.cardsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparator<Card>, Comparable<Card>{
    public Suit suit;
    private String value;
    static List<String> values = new ArrayList<String>();
    static List<Suit> suits = new ArrayList<Suit>();

    static {
        values.add("01");
        values.add("02");
        values.add("03");
        values.add("04");
        values.add("05");
        values.add("06");
        values.add("07");
        values.add("08");
        values.add("09");
        values.add("10");
        values.add("J");
        values.add("Q");
        values.add("K");
        values.add("A");

        suits.add(Suit.Hearts);
        suits.add(Suit.Diamonds);
        suits.add(Suit.Clubs);
        suits.add(Suit.Spades);
    };

    public Card(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int compareTo(Card c) {
        return compare(this, c);
    }

    public int compare(Card c1, Card c2) {
//        System.out.println(c1 + " compare " + c2 " = " + )
        int suitComp = suits.indexOf(c1.suit) - suits.indexOf(c2.suit);
        int valComp = values.indexOf(c1.value) - values.indexOf(c2.value);
        int comp = 0;
        if (valComp != 0) {
            comp = valComp;
        } else {
            comp = suitComp;
        }

        return comp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value='" + value + '\'' +
                '}';
    }
}
