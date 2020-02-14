package com.silversky.metronet.cardsort;

public class CardsortDemo {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.addCard(new Card("A", Suit.Clubs));
        deck.addCard(new Card("03", Suit.Clubs));
        deck.addCard(new Card("09", Suit.Clubs));
        deck.addCard(new Card("02", Suit.Clubs));
        deck.addCard(new Card("10", Suit.Clubs));
        deck.addCard(new Card("K", Suit.Clubs));
        deck.addCard(new Card("07", Suit.Clubs));
        deck.addCard(new Card("J", Suit.Clubs));
        deck.addCard(new Card("01", Suit.Clubs));
        deck.addCard(new Card("Q", Suit.Clubs));
        deck.addCard(new Card("06", Suit.Clubs));
        deck.addCard(new Card("10", Suit.Clubs));
        deck.addCard(new Card("05", Suit.Clubs));
        deck.addCard(new Card("08", Suit.Clubs));

        deck.addCard(new Card("A", Suit.Diamonds));
        deck.addCard(new Card("03", Suit.Diamonds));
        deck.addCard(new Card("09", Suit.Diamonds));
        deck.addCard(new Card("02", Suit.Diamonds));
        deck.addCard(new Card("10", Suit.Diamonds));
        deck.addCard(new Card("K", Suit.Diamonds));
        deck.addCard(new Card("07", Suit.Diamonds));
        deck.addCard(new Card("J", Suit.Diamonds));
        deck.addCard(new Card("01", Suit.Diamonds));
        deck.addCard(new Card("Q", Suit.Diamonds));
        deck.addCard(new Card("06", Suit.Diamonds));
        deck.addCard(new Card("10", Suit.Diamonds));
        deck.addCard(new Card("05", Suit.Diamonds));
        deck.addCard(new Card("08", Suit.Diamonds));

        deck.addCard(new Card("A", Suit.Hearts));
        deck.addCard(new Card("03", Suit.Hearts));
        deck.addCard(new Card("09", Suit.Hearts));
        deck.addCard(new Card("02", Suit.Hearts));
        deck.addCard(new Card("10", Suit.Hearts));
        deck.addCard(new Card("K", Suit.Hearts));
        deck.addCard(new Card("07", Suit.Hearts));
        deck.addCard(new Card("J", Suit.Hearts));
        deck.addCard(new Card("01", Suit.Hearts));
        deck.addCard(new Card("Q", Suit.Hearts));
        deck.addCard(new Card("06", Suit.Hearts));
        deck.addCard(new Card("10", Suit.Hearts));
        deck.addCard(new Card("05", Suit.Hearts));
        deck.addCard(new Card("08", Suit.Hearts));


        deck.addCard(new Card("A", Suit.Spades));
        deck.addCard(new Card("03", Suit.Spades));
        deck.addCard(new Card("09", Suit.Spades));
        deck.addCard(new Card("02", Suit.Spades));
        deck.addCard(new Card("10", Suit.Spades));
        deck.addCard(new Card("K", Suit.Spades));
        deck.addCard(new Card("07", Suit.Spades));
        deck.addCard(new Card("J", Suit.Spades));
        deck.addCard(new Card("01", Suit.Spades));
        deck.addCard(new Card("Q", Suit.Spades));
        deck.addCard(new Card("06", Suit.Spades));
        deck.addCard(new Card("10", Suit.Spades));
        deck.addCard(new Card("05", Suit.Spades));
        deck.addCard(new Card("08", Suit.Spades));

        deck.sort(true);
        System.out.println("Ascending...");
        for (Card card: deck.getCards()){
            System.out.println(card);
        }

        deck.sort(false);
        System.out.println("\nDescending...");
        for (Card card: deck.getCards()){
            System.out.println(card);
        }
    }
}
