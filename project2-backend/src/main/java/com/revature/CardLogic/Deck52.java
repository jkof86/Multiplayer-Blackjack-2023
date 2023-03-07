package com.revature.CardLogic;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Deck52 {
    private List<Card52> deck = new ArrayList<>();

    public Deck52(){
        for(Card52.Suit s : Card52.Suit.values()){
			for(Card52.Rank r : Card52.Rank.values()){
				deck.add(new Card52(s, r));
			}
		}
    }

    public Deck52 shuffle(){
        Collections.shuffle(deck);
        return this;
    }

    //Get the number of cards remaining in the deck.
    public int size(){
        return deck.size();
    }

    //Shorthand function that can be used to quickly determine if peek() and pop() are safe to execute.
    public boolean hasNext() {
        return deck.size() > 0;
    }

    //Show the next card in the deck without removing it. 
    public Card52 peek() throws IndexOutOfBoundsException {
        if(deck.size() == 0) throw new IndexOutOfBoundsException("There are no more cards left to take.");
        return deck.get(0);
    }

    //Remove the next card from the deck and return it.
    public Card52 pop() throws IndexOutOfBoundsException {
        if(deck.size() == 0) throw new IndexOutOfBoundsException("There are no more cards left to take.");
        return deck.remove(0);
    }


    @Override
    public String toString() {
        return "{" +
            " deck='" + deck + "'" +
            "}";
    }
    
}
